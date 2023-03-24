package com.example.mobproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SignUpActivity extends AppCompatActivity {

    private TextView login;
    private TextView password;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        login = (TextView) findViewById(R.id.editTextTextEmailAddress);
        password = (TextView)findViewById(R.id.editTextTextPassword);
        String txtLogin = getIntent().getStringExtra("login");
        String txtPassword = getIntent().getStringExtra("password");
        login.setText(login.getText().toString() + txtLogin);
        password.setText(password.getText().toString() + txtPassword);
    }
    public void onClick(View view) {
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }
    public void signupClick(View view){
        Toast toast = Toast.makeText(getApplicationContext(), "Click", Toast.LENGTH_SHORT);
        toast.show();
    }
}