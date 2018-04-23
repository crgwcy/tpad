package com.crg.tpad.ui.mainAct;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.crg.tpad.R;
import com.crg.tpad.util.log.Mylog;
import com.crg.tpad.util.parcelable.MyParcelable;

import java.io.BufferedWriter;
import java.util.Timer;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG=Main2Activity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    @Override
    protected void onResume() {
        super.onResume();
        getParcelTest();
       // this.openFileInput()
     //   Context
     /*
        SharedPreferences ss= PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor  editor=ss.edit();
        editor.putString("test","crgwcy");
        editor.apply();
     */
     //   SQLiteOpenHelper
/*
        ContentValues   cv=new ContentValues();
        cv.clear();
*/
    }
    private void getParcelTest()
    {
        Intent intent=getIntent();
        if(intent!=null)
        {
            MyParcelable tmp = intent.getParcelableExtra("parcel");
            if(tmp!=null)
                Mylog.printf(TAG,"..........getParcel=%d",tmp.getmData());
        }
    }
}
