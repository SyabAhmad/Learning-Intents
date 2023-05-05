package com.example.learningintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText name, mail, number, code, password;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name);
        mail = (EditText) findViewById(R.id.mail);
        number = (EditText) findViewById(R.id.rollNumber);
        code = (EditText) findViewById(R.id.code);
        password = (EditText) findViewById(R.id.password);





      submit = (Button) findViewById(R.id.submit);
      submit.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(MainActivity.this, aboutsection.class);

              String name1 = name.getText().toString();
              String mail1 = mail.getText().toString().trim();
              String number1 = number.getText().toString();
              String code1 = code.getText().toString();
              String password1 = password.getText().toString();

              if (name1.equals("")
                      || mail1.equals("")
                      || number1.equals("")
                      || password1.equals("")){
                  Toast.makeText(MainActivity.this, "all Fields should be filled", Toast.LENGTH_SHORT).show();
              } else {
                  intent.putExtra("name",name1);
                  intent.putExtra("mail",mail1);
                  intent.putExtra("number",number1);
                  intent.putExtra("password",password1);
                  if (code1.equals(""))
                  {
                      intent.putExtra("code","No Referral");
                  }
                  else {
                      intent.putExtra("code",code1);
                  }
                  startActivity(intent);
                  finish();
              }


          }
      });



    }

}