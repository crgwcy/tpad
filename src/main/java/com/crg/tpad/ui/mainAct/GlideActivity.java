package com.crg.tpad.ui.mainAct;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.crg.tpad.R;


public class GlideActivity extends AppCompatActivity {

    ImageView imageView;
    private static final String JPG_PATH="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521717696589&di=b1f381efb6b7d6972d4f9a7efcdc7659&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F017ab5564de4b36ac7251c948708df.gif";//"http://b.hiphotos.baidu.com/image/pic/item/14ce36d3d539b600b36afca3e550352ac65cb77a.jpg";
    private static final String JPG_PATH2="http://c.hiphotos.baidu.com/image/pic/item/314e251f95cad1c8d5dbf23a733e6709c93d514e.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);
        imageView = (ImageView) findViewById(R.id.image_view);
    }

    private static final String TAG=GlideActivity.class.getSimpleName();
    public   void rxtest()
    {
/*
            long time2=System.currentTimeMillis();
                Observable.just(testloadImage())
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(result -> gotoMainPage());
*/
    }

    public String testloadImage() {
        Glide.with(this).load(JPG_PATH);//.into(imageView);
      //  Glide.with(this).load(JPG_PATH2).into(imageView);
        return null;
    }
    public void loadImage(View view) {
        long time1=System.currentTimeMillis();
        Glide.with(this).load(JPG_PATH).asGif().error(R.drawable.common_full_open_on_phone).into(imageView);
        long time2=System.currentTimeMillis();
        Log.e(GlideActivity.class.getSimpleName(),"pic1 duration="+(time2-time1));
  /*      try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        long time3=System.currentTimeMillis();
     //   Glide.with(this).load(JPG_PATH2).into(imageView);
        long time4=System.currentTimeMillis();
        Log.e(GlideActivity.class.getSimpleName(),"pic2 duration="+(time4-time3));

    }
}
