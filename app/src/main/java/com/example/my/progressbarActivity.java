package com.example.my;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import java.time.Instant;


public class progressbarActivity extends AppCompatActivity
{

    AppCompatButton btnHide,btnVisible;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);
        initview();
    }

    private void initview()
    {
        btnHide=findViewById(R.id.btnHide);
        btnVisible=findViewById(R.id.btnVisible);
        progressBar=findViewById(R.id.progressBar);

        btnVisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               progressBar.setVisibility(View.VISIBLE);
                Intent i = new Intent(progressbarActivity.this,instragramActivity.class);
                startActivity(i);
            }
        });

        btnHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.GONE);
            }
        });


    }

}