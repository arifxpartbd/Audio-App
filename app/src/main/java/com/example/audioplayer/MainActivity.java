package com.example.audioplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button gitbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mack a new file

        gitbutton=findViewById(R.id.new_gitId);

        gitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gitbutton.setText("Ok");
            }
        });
    }
}