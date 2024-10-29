package com.example.temperatureconvertor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView ans=(TextView) findViewById(R.id.textView2);
        Button b1 = (Button) findViewById(R.id.button3);
        Button b2 = (Button) findViewById(R.id.button4);
        EditText t = (EditText) findViewById(R.id.editTextNumberDecimal);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float c,fa;
                fa=Float.parseFloat(t.getText().toString());
                c=(fa-32)*5/9;
                ans.setText(c+" ");

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float f,ce;
                ce=Float.parseFloat(t.getText().toString());
                f= (float) ((1.8*ce)+32);
                ans.setText(f+" ");

            }
        });
    }

}