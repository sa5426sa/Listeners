package com.example.listeners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button BtnR;
    Button BtnB;
    int countR=0;
    int countB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BtnR=findViewById(R.id.btnR);
        BtnB=findViewById(R.id.btnB);
    }

    public void onRedClick(View view) {
        countR++;
        BtnR.setText("clicks: "+countR);
    }

    public void onBlueClick(View view) {
        countB++;
        BtnB.setText("clicks: "+countB);
    }
}