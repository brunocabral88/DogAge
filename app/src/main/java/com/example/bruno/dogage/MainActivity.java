package com.example.bruno.dogage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView txtResultado;
    private int dogAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editTextAge);

        txtResultado = (TextView) findViewById(R.id.txtResult);
        Button btnGo = (Button) findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dogAge = Integer.parseInt(editText.getText().toString());
                txtResultado.setText("Your dog's human age is: " + (dogAge * 7) + " years old!");
            }
        });

    }
}
