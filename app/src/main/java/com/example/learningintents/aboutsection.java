package com.example.learningintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class aboutsection extends AppCompatActivity {

    private TextView name1, mail1, number1, code1, password1;
    private Button changeOrEditHere;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutsection);

        name1 = (TextView) findViewById(R.id.name1);
        mail1 = (TextView) findViewById(R.id.mail1);
        number1 = (TextView) findViewById(R.id.rollNumber1);
        code1 = (TextView) findViewById(R.id.code1);
        password1 = (TextView) findViewById(R.id.password1);

        Intent intent = getIntent();

        String name = intent.getStringExtra("name").toString();
        String mail = intent.getStringExtra("mail");
        String code = intent.getStringExtra("code");
        String password = intent.getStringExtra("password");
        String number = intent.getStringExtra("number");

        name1.setText(name);
        mail1.setText(mail);
        code1.setText(code);
        number1.setText(number);
        password1.setText(password);

        System.out.println(name);

        changeOrEditHere = (Button) findViewById(R.id.change);
        changeOrEditHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(aboutsection.this, "Data Cleared", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(aboutsection.this, MainActivity.class));
            }
        });





    }
}