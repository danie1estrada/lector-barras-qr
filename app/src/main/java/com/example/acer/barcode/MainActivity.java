package com.example.acer.barcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static TextView txtResult;
    private Button btnScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = findViewById(R.id.txt_result);
        btnScan = findViewById(R.id.btn_scan);
    }

    public void scan(View view) {
        startActivity(new Intent(getApplicationContext(), ScannerActivity.class));
    }

    public static void setResult(String result) {
        txtResult.setText(result);
    }
}
