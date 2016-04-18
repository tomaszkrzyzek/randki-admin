package me.krzyzek.tomaszkrzyzek.randkiadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void zalogujClik(View v){
        EditText loginET = (EditText) findViewById(R.id.loginET);
        EditText passwordET = (EditText) findViewById(R.id.passwordET);
        if(loginET.getText().toString().equals("admin") && passwordET.getText().toString().equals("admin")){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }


    }
}
