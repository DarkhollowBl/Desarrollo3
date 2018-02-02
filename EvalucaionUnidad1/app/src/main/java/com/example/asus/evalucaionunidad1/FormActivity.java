package com.example.asus.evalucaionunidad1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ASUS on 01/02/2018.
 */

public class FormActivity extends AppCompatActivity{
    EditText txtName;
    EditText txtAge;
    EditText txtNumber;
    Button btnSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_layout);
        txtName = findViewById(R.id.edtName);
        txtAge = findViewById(R.id.edtAge);
        txtNumber = findViewById(R.id.edtNumber);
        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormActivity.this, DataActivity.class);
                intent.putExtra("Info",txtName.getText().toString());
                intent.putExtra("Info1",txtAge.getText().toString());
                intent.putExtra("Info2",txtNumber.getText().toString());
                startActivity(intent);
            }
        });
    }
}
