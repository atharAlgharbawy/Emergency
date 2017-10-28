package com.example.win_7.emergences;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Fire extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire);
    }// on create

    public void call(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        String temp = "tel:" + "180";
        intent.setData(Uri.parse(temp));

        startActivity(intent);
    }//call

    public void send(View view) {
        Uri uri = Uri.parse("smsto:180");
        Intent i = new Intent(Intent.ACTION_SENDTO, uri);
        i.putExtra("sms_body", "Tell us what happening to you");
        startActivity(i);
    }//send



}//class
