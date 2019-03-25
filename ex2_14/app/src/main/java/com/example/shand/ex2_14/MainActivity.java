package com.example.shand.ex2_14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.ImageSwitcher;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ViewSwitcher.ViewFactory;

public class MainActivity extends AppCompatActivity {
    private ImageSwitcher imageSwitcher;
    Gallery gallery;
    private int[] imgs = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageSwitcher = (ImageSwitcher)findViewById(R.id.ImageSwitcher01);
        imageSwitcher.setFactory(new viewFactory());
        imageSwitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
        imageSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));
        imageSwitcher.setImageResource(R.drawable.img1);
        gallery = (Gallery)findViewById(R.id.Gallery01);
        gallery.setOnItemSelectedListener(new onItemSelectedListener());
        gallery.setSpacing(10);
        gallery.setAdapter(new baseAdapter());
    }
    class viewFactory implements ViewFactory{
        @Override
        public View makeView() {
            ImageView imageView = new ImageView(MainActivity.this);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return imageView;
        }
    }
    class onItemSelectedListener implements OnItemSelectedListener{
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            imageSwitcher.setImageResource((int)gallery.getItemIdAtPosition(position));
        }
        @Override
        public void onNothingSelected(AdapterView<?> arg0){ }
    }
    class baseAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return imgs.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return imgs[position];
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(MainActivity.this);
            imageView.setImageResource(imgs[position]);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams(new Gallery.LayoutParams(60, 60));
            return imageView;
        }
    }
}
