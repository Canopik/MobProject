package com.example.mobproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class SignIn extends AppCompatActivity {
    private static final String TAG = "MyApplication";
    private EditText login;
    private EditText password;
    private Button signin2_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Button signin2_button = (Button)findViewById(R.id.signin2_button);
        login = (EditText)findViewById(R.id.signin_text);
        password = (EditText)findViewById(R.id.pass);
        Intent intent_signup = new Intent(this, SignUpActivity.class);
        signin2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup_intent = new Intent(getApplicationContext(), SignUpActivity.class);
                intent_signup.putExtra("login", login.getText().toString());
                intent_signup.putExtra("password", password.getText().toString());
                startActivity(signup_intent);
            }
        });
    }
}