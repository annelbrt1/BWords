package com.example.bwords;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scanpage);

        // Find the scan button and set up click listener
        Button scanButton = findViewById(R.id.scan_button);
        scanButton.setOnClickListener(v -> {
            // Start OCR module activity
            Intent intent = new Intent(MainActivity.this, xyz.sanster.deepandroidocr.MainActivity.class);
            startActivity(intent);
        });
    }
}