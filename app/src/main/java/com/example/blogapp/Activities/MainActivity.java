package com.example.blogapp.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.blogapp.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button regBtn = (Button) findViewById(R.id.signUpBtn);
        regBtn.setOnClickListener(this);

        Button loginBtn = (Button) findViewById(R.id.loginBtn);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.signUpBtn:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
        }
    }
}
