package com.example.samdassignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    private Button login_button;
    //    private EditText email, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_login);

        EditText email = (EditText)  findViewById(R.id.etEmail);
        EditText pass = (EditText)  findViewById(R.id.etpass);
        CheckBox remCheck = (CheckBox)  findViewById(R.id.rmcb);

        login_button = (Button) findViewById(R.id.loginbtn);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //check if email or password is empty
                if(!email.getText().toString().isEmpty() &&  !pass.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "login Successful !!!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Fill the fields", Toast.LENGTH_SHORT).show();
                }
                // get email, password and check inputs
                String email_id = email.getText().toString();
                String password = pass.getText().toString();
                String rememberCheck = remCheck.isChecked() ? "true" : "false";

                //pass email, pass, check from this mainActivity to another activity
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("email", email_id);
                intent.putExtra("password", password);
                intent.putExtra("remember", rememberCheck);

                startActivity(intent);
            }
        });
    }
}