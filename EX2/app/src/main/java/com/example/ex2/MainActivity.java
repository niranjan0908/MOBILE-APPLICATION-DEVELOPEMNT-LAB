package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button clickBtn, longClickBtn, allBtn, btnShow;
    TextView sample;
    EditText nameTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickBtn = (Button) findViewById(R.id.btnClick);
        longClickBtn = (Button) findViewById(R.id.btnLongClick);
        allBtn = (Button) findViewById(R.id.btnAll);
        btnShow = (Button) findViewById(R.id.btnShowName);
        sample = (TextView) findViewById(R.id.txtSample);
        nameTxt = (EditText) findViewById(R.id.txtName);

        clickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hai fella!", Toast.LENGTH_SHORT).show();
            }
        });
        longClickBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), "Hai there!",
                        Toast.LENGTH_SHORT).show();
                return false;
            }



        });
        allBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You Just Clicked Me!",
                        Toast.LENGTH_SHORT).show();
            }
        });
        allBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), "You clicked me for so long!",
                        Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sample.setText(nameTxt.getText().toString());
            }
        });
    }
}