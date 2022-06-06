package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tervehdysTeksti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tervehdysTeksti = findViewById(R.id.tvTervehdys);
    }

    public void vaihdaTeksti(View view)
    {
        tervehdysTeksti.setText("Hei maailma");
    }
}