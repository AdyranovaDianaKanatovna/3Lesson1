package com.example.a3lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    private EditText username, password;
    private Button btnGo;
    private ImageView imageCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initLister();
        Glide.with(this).load("https://i.pinimg.com/474x/23/ab/a6/23aba60b66ef08174bb7455c4a8a2d2f.jpg").into(imageCar);

    }

    private void initLister() {
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().isEmpty()) {
                    username.setError("This filed mustn't be empty");
                } else if (password.getText().toString().isEmpty()) {
                    password.setError("This filed mustn't be empty");
                } else {
                    Toast.makeText(MainActivity.this, "Successful", Toast.LENGTH_SHORT).
                            show();
                }
            }
        });
    }

    private void init() {
        username = findViewById(R.id.et_username);
        password = findViewById(R.id.et_password);
        btnGo = findViewById(R.id.btn_go);
        imageCar=findViewById(R.id.image_car);
    }
}