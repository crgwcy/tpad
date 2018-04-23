package com.crg.tpad.ui.mainAct;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.crg.tpad.R;
import com.crg.tpad.socket.Client;
import com.crg.tpad.util.log.Mylog;
import com.crg.tpad.util.parcelable.MyParcelable;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String TAG=MainActivity.class.getSimpleName();

    @OnClick(R.id.parceltestID)
    public void myParceTest()
    {
/*
        Mylog.printf(TAG,"application=%s,applicationcontext=%s,getBaseContext=%s",getApplication(),getApplicationContext(),getBaseContext());
    //  Mylog.printf(TAG,"this1=%s",(Context)this);
        Mylog.printf(TAG,"%s","myParceTest");
        testParcel();
*/
/*
        new Thread(new Runnable() {
            @Override
            public void run() {
                Client.clietTest();
            }
        }).start();
*/
        Intent intent=new Intent(getApplicationContext(),GlideActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //绑定activity
        ButterKnife.bind( this ) ;
        /*
        add git test!!!
        test!!!

        * */
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
    }

    private void testParcel()
    {
        MyParcelable  parcelable=new MyParcelable(998);
        Intent   intent=new Intent();
        intent.setClass(this,Main2Activity.class);
        intent.putExtra("parcel",parcelable);
        startActivity(intent);
//      getAssets()
    }
}
