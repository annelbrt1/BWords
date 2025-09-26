package com.example.bwords;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // Find button
        Button studentBtn = findViewById(R.id.btn_student);

        // Handle click
        studentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to Login.java
                Intent intent = new Intent(Main.this, Login.class);
                startActivity(intent);
            }
        });
    }
}
