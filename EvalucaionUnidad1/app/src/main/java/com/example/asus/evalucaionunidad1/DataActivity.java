package com.example.asus.evalucaionunidad1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ASUS on 01/02/2018.
 */

public class DataActivity extends AppCompatActivity {
     TextView txtInfo;
    TextView txtInfo1;
    TextView txtInfo2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_layout);
        txtInfo = findViewById(R.id.txtName);
        txtInfo1 = findViewById(R.id.txtAge);
        txtInfo2 = findViewById(R.id.txtNumber);
        Bundle bundle = getIntent().getExtras();

        String dato = bundle.getString("Info").toString();
        txtInfo.setText(dato);
        String dato1 = bundle.getString("Info1").toString();
        txtInfo1.setText(dato1);
        String dato2 = bundle.getString("Info2").toString();
        txtInfo2.setText(dato2);
    }
    }
