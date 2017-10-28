package com.example.win_7.emergences;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }//on create


    public void fire(View view) {
        Intent intent = new Intent(this, Fire.class);
        startActivity(intent);
    }
}
