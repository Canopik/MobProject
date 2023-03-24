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
    private EditText email;
    private EditText pass;
    private Button signin2_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        EditText signin = (EditText)findViewById(R.id.signin_text);
        EditText pass = (EditText)findViewById(R.id.pass);
        Button signin2_button = (Button)findViewById(R.id.signin2_button);
        Intent intent_signup = new Intent(this, SignUpActivity.class);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_signup.putExtra("email_name_key", email.getText().toString());
                startActivity(intent_signup);
            }
        });
        Intent intent_pass = new Intent(this, SignUpActivity.class);
        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_pass.putExtra("pass_key", pass.getText().toString());
            }
        });
        signin2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup_intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(signup_intent);
            }
        });
    }
}