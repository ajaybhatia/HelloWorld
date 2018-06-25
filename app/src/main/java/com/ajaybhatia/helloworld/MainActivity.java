package com.ajaybhatia.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // References of all components in Layout (xml)
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String value = editText.getText().toString();
//                textView.setText("Hello, " + value + "!");
//                Toast.makeText(getApplicationContext(), "Hello, " + value + "!", Toast.LENGTH_LONG).show();
//            }
//        });
    }

    public void greeting(View view) {
        String value = editText.getText().toString();
        textView.setText("Hello, " + value + "!");
        Toast.makeText(getApplicationContext(), "Hello, " + value + "!", Toast.LENGTH_LONG).show();
    }
}
