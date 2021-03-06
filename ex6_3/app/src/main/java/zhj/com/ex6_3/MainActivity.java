package zhj.com.ex6_3;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends Activity {
    WebView webView;
    Handler handler = new Handler();
    MWebChromeClient mWebChromeClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView)findViewById(R.id.webView1);
        WebSettings webSettings = webView.getSettings();
        webSettings.setAllowFileAccess(true);
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDefaultFontSize(24);
        MObject mObject = new MObject();
        webView.addJavascriptInterface(mObject, "test");
        mWebChromeClient = new MWebChromeClient();
        webView.setWebChromeClient(mWebChromeClient);
        webView.loadUrl("file:///android_asset/test.html");
    }
    class MObject extends Object{
        @JavascriptInterface
        public void android_show(){
            handler.post(new Runnable() {
                @Override
                public void run() {
                    System.out.println("提示：使用了多线程的run()方法!!");
                    webView.loadUrl("javascript: show_alert()");
                }
            });
        }
    }
    class MWebChromeClient extends WebChromeClient{
        @Override
        public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
            return true;
        }
    }
}
