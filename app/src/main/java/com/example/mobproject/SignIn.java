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
    Button sign_in_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView sign_in_text = (TextView) findViewById(R.id.signin_text);
        setContentView(R.layout.activity_sign_in);
        Intent intent_signup = new Intent(this, SignUpActivity.class);
        sign_in_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent_signup.putExtra("email_name_key", email.getText().toString());
                startActivity(intent_signup);
                Log.i(TAG, "To SignUp");

            }
        });
    }
}