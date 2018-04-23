package com.crg.tpad.ui.mainAct;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import com.crg.tpad.R;

public class DrawerLayoutActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_layout);
        initViews();
        setListeners();
    }


    private void initViews() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_main_layout);
        mDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED,
                Gravity.RIGHT);
        mButton = (Button) findViewById(R.id.btn_main_right);
    }

    private void setListeners() {
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDrawerLayout.openDrawer(Gravity.RIGHT);
                mDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED,
                        Gravity.RIGHT);
            }
        });
        mDrawerLayout.setDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            //在这个方法里可以设置动画效果
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

            }

            // 菜单打开
            @Override
            public void onDrawerOpened(View drawerView) {

            }

            // 菜单关闭
            @Override
            public void onDrawerClosed(View drawerView) {
                mDrawerLayout.setDrawerLockMode(
                        DrawerLayout.LOCK_MODE_LOCKED_CLOSED, Gravity.RIGHT);
            }

            @Override
            public void onDrawerStateChanged(int newState) {

            }
        });
    }
}
