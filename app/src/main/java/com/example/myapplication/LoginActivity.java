package com.example.myapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);
        MaterialButton loginButton = findViewById(R.id.button);
        TextInputEditText loginView = findViewById(R.id.login);
        TextInputEditText passWord = findViewById(R.id.password);
        loginButton.setOnClickListener(v -> {
                    if (loginView.getText().toString().equals("this@that.com") && passWord.getText().toString().equals("password")) {
                        Toast.makeText(this,"Well that checks out",Toast.LENGTH_LONG).show();
                    }
                }

        );

    }
}
