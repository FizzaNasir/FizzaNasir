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
        if (in.equals("a")||in.equals("c")||in.equals("e")||in.equals("i")||in.equals("o")||in.equals("m")||in.equals("n")||in.equals("r")||in.equals("s")||in.equals("u")||in.equals("v")||in.equals("w")||in.equals("x")||in.equals("z"))
        {
            grass.setBackgroundColor(Color.rgb(25, 230, 56));
            sky.setBackgroundColor(Color.rgb(250, 209, 240));
            root.setBackgroundColor(Color.rgb(250, 209, 240));
        }
        else if(in.equals("b")||in.equals("d")||in.equals("h")||in.equals("k")||in.equals("t")||in.equals("f")||in.equals("l"))
        {
            sky.setBackgroundColor(Color.rgb(25, 230, 56));
            grass.setBackgroundColor(Color.rgb(250, 209, 240));
            root.setBackgroundColor(Color.rgb(250, 209, 240));
        }
        else
        {
            root.setBackgroundColor(Color.rgb(25, 230, 56));
            sky.setBackgroundColor(Color.rgb(250, 209, 240));
            grass.setBackgroundColor(Color.rgb(250, 209, 240));
        }
    }


}