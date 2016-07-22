package com.example.onix.trainloginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;
    EditText editText1, editText2;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        textView1 = (TextView)findViewById(R.id.textView1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(editText1.getText().toString().equals("admin") &&
                        editText2.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Iniciando sesion...", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Error en sesion", Toast.LENGTH_SHORT).show();

                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
