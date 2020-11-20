package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lav.CredentialsChecker;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_login=(Button)findViewById(R.id.login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignIn();
            }
        });

    }
    public void SignIn() {
        EditText emailText = findViewById(R.id.email);
        EditText passwordText = findViewById(R.id.password);
        final String email = emailText.getText().toString();
        final String password = passwordText.getText().toString();
        CredentialsChecker checker = new CredentialsChecker(this);
        if(checker.checkEmail(email))
        checker.checkPassword(password);

    }
}
