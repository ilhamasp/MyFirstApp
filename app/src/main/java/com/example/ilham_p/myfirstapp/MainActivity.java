package com.example.ilham_p.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final int MYCONST = 842;
    private static final String LOGTAG = "MainActivity";
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //doThis();

        Log.i(TAG, "onCreate");

        for (int i = 0; i < 3; i++) {
            Log.i(TAG, "onCreate: i=" + i);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "onPause");
    }

    private void doThis() {
        MyTextUtil textUtil = new MyTextUtil();
        textUtil.doSomethingElse();

        Intent intent = new Intent();

        Toast.makeText(MainActivity.this, "My Message", Toast.LENGTH_SHORT).show();

        Log.i(LOGTAG, "doThis: my message");

        TextView tv = (TextView) findViewById(R.id.myTextView);
        tv.setText("My Message");
    }
}
