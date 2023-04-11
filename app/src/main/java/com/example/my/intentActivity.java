package com.example.my;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class intentActivity extends AppCompatActivity {


   String data;
    EditText edtEmail,edtPass;
    TextView text123;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);
       initview();
}

    private void initview()
    {
        edtEmail=findViewById(R.id.edtEmail);
        edtPass=findViewById(R.id.edtPass);
        text123=findViewById(R.id.text123);
        if(getIntent()!=null)
        {
             data=getIntent().getStringExtra("Email");


        }
    }
}