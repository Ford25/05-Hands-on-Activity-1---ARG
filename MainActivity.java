package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.input1);
        editText2 = findViewById(R.id.input2);
    }

    public void swapTextFields(View view) {
        String temp = editText1.getText().toString();
        editText1.setText(editText2.getText().toString());
        editText2.setText(temp);
    }

    public void compareTextFields(View view) {
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();

        Intent intent = new Intent(this, Result.class);
        if (text1.equals(text2)) {
            intent.putExtra("result", "SAME");
        } else {
            intent.putExtra("result", "NOT THE SAME");
        }
        startActivity(intent);
    }
}
