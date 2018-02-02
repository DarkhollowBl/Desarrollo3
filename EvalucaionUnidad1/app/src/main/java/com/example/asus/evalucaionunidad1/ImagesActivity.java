package com.example.asus.evalucaionunidad1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ImagesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.images_view2);
    }
    public void nextActivityCalcu(View view){
        startActivity(new Intent(this, CalcuActivity.class));
    }
    public void nextActivityForm(View view){
        startActivity(new Intent(this, FormActivity.class));
    }
}
