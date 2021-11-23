package com.example.samdassignment1;import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String email = intent.getStringExtra("email");
        String pass = intent.getStringExtra("password");
        String check = intent.getStringExtra("remember");

        TextView textView= (TextView)findViewById(R.id.edEmail);
        textView.setText(email);

        TextView textView2= (TextView)findViewById(R.id.edPass);
        textView2.setText(pass);

        TextView textView3= (TextView)findViewById(R.id.edrm);
        textView3.setText(check);
    }
}