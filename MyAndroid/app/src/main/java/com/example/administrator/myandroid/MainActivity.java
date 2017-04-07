package com.example.administrator.myandroid;

import android.os.Bundle;
import android.widget.ListView;

import base.BaseActivity;
import utils.MyAsynctask;
import utils.URL;

public class MainActivity extends BaseActivity {

    private ListView mLv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();

        initdata();

    }

    @Override
    public void initview() {
        super.initview();

        mLv = (ListView) findViewById(R.id.lv);

    }

    @Override
    public void initdata() {
        super.initdata();

        MyAsynctask myAsynctask = new MyAsynctask(this, URL.url,mLv);
        myAsynctask.execute();


    }

}
