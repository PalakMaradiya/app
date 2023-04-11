package com.example.my;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class checkBoxActivity extends AppCompatActivity
{

    CheckBox cbSinging,cbDancing,cbTravelling,cbReading;

    AppCompatButton btnSubmit;

    String hobby="";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        initview();
    }

    private void initview()
    {
        cbSinging=findViewById(R.id.cbSinging);
        cbDancing=findViewById(R.id.cbDancing);
        cbTravelling=findViewById(R.id.cbTravelling);
        cbReading=findViewById(R.id.cbReading);
        btnSubmit=findViewById(R.id.btnSubmit);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hobby="";
                if(cbSinging.isChecked())
                {
                    hobby+=cbSinging.getText().toString();
                    Toast.makeText(checkBoxActivity.this,hobby  ,Toast.LENGTH_SHORT).show();
                }
                if(cbDancing.isChecked())
                {
                    hobby+=cbDancing.getText().toString();
                    Toast.makeText(checkBoxActivity.this,hobby  ,Toast.LENGTH_SHORT).show();
                }
                if(cbTravelling.isChecked())
                {
                    hobby+=cbTravelling.getText().toString();
                    Toast.makeText(checkBoxActivity.this,hobby  ,Toast.LENGTH_SHORT).show();
                }
                if(cbReading.isChecked())
                {
                    hobby+=cbReading.getText().toString();
                    Toast.makeText(checkBoxActivity.this,hobby  ,Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}