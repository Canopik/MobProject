package com.example.mobproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ImageView imageView = (ImageView)findViewById(R.id.imageView2);
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