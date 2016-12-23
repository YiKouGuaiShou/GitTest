package com.zhujie.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "蔡大头", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "蔡大头+1", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "蔡大头+2", Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, "蔡大头+3", Toast.LENGTH_SHORT).show();
    }
}
