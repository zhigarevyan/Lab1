package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        writeWord();
    }

    private void writeWord(){
        //TODO laba
        TextView tv = findViewById(R.id.MyText);
        tv.setText("Heyyyyyyyy");
    }
}