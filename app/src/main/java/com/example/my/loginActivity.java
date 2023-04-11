package com.example.my;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
    EditText edtEmail;
    Button btnSubmit;
    EditText edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initview();
    }

    private void initview()
    {
        edtEmail =findViewById(R.id.edtEmail);
        btnSubmit=findViewById(R.id.btnSubmit);
        edtPass=findViewById(R.id.edtPass);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email ,password;
                email = edtEmail.getText().toString();
                password =edtPass.getText().toString();



                if (email.isEmpty())
                {
                    Toast.makeText(loginActivity.this,"Please Enter Your E-mail ",Toast.LENGTH_SHORT).show();
                }
                else if (password.isEmpty())
                {
                    Toast.makeText(loginActivity.this,"Please Enter Your Password ",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(loginActivity.this,"your account created successful ",Toast.LENGTH_SHORT).show();
                }


                String Email = edtEmail.getText().toString();
                Intent i = new Intent(loginActivity.this,intentActivity.class);
                i.putExtra("email",email);
                startActivity(i);


            }
        });

    }
}