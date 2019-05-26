package zhj.com.ex6_1;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    WebView webView;
    Button openWebBtn;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openWebBtn = (Button) findViewById(R.id.button1);
        editText = (EditText)findViewById(R.id.editText1);
        openWebBtn.setOnClickListener(new mClick());
    }

    class mClick implements OnClickListener{
        @Override
        public void onClick(View v) {
            String url = editText.getText().toString();
            webView = (WebView)findViewById(R.id.webView1);
            webView.setWebViewClient(new WebViewClient() {
                /**
                 * 重写shouldOverrideUrlLoading，返回值若为true将用webview，false则是系统自身浏览器
                 */
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    view.loadUrl(url);
                    return true;
                }
            });
            webView.loadUrl("http://" + url);
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (webView.canGoBack()) {
                webView.goBack();
                return true;
            } else {
                System.exit(0);
            }
        }
        return super.onKeyDown(keyCode, event);
    }
}
