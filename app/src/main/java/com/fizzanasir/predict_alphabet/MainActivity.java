package com.fizzanasir.predict_alphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    TextView root, grass, sky;
    Button check;
    EditText input;
    String in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check=findViewById(R.id.check_btn);
        check.setOnClickListener(this);
        grass=findViewById(R.id.Grass);
        sky=findViewById(R.id.Sky);
        root=findViewById(R.id.Root);
    }

    @Override
    public void onClick(View view) {
        input=(EditText) findViewById(R.id.user_input);
        in=input.getText().toString().toLowerCase();
        if (in.equals("a")||in.equals("c")||in.equals("e")||in.equals("i")||in.equals("o"))
        {
            grass.setBackgroundColor(Color.GREEN);
        }
        else if(in.equals("b")||in.equals("d")||in.equals("h")||in.equals("k"))
        {
            sky.setBackgroundColor(Color.GREEN);
        }
        else
        {
            root.setBackgroundColor(Color.GREEN);
        }
    }


}