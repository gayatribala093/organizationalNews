package com.example.organisation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    //Initialize Variable
    ImageView ivInstagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign Variable
        ivInstagram=findViewById(R.id.iv_instagram);

        ivInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Initialize Link and Package
                String sAppLink="https://www.instagram.com/organisational_news?igsh=M20xdTVnaWtmZnZy";
                String sPackage="com.instagram.android";
                //Call Method
                openLink(sAppLink,sPackage,sAppLink);

            }
        });

    }

    private void openLink(String sAppLink, String sPackage, String sAppLink1) {
        //Use try catch
        try {
            //When application is installed
            //Initialize uri
            Uri uri = Uri.parse(sAppLink);
            //Initialize Intent
            Intent intent = new Intent(Intent.ACTION_VIEW);
            //Set data
            intent.setData(uri);
            //set package
            intent.setPackage(sPackage);
            //set flag
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            //Start activity
            startActivity(intent);
        }catch (ActivityNotFoundException activityNotFoundException){
        }
    }

    public void openMain2(View view) {
      startActivity(new Intent(this, MainActivity2.class));
    }



}
