package com.animeshjain.assignment41;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class main extends AppCompatActivity {

    Button login;
    EditText email, password;
    String user, pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);
        login = (Button)findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = email.getText().toString();
                pwd = password.getText().toString();

                if (user.equals("ani") && pwd.equals("123")) {

                    Toast.makeText(getApplicationContext(),"Credentials Match",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Login Failure",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
