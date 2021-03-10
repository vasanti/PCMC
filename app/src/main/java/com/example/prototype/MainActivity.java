package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login=(Button) findViewById(R.id.login);
        EditText username=(EditText) findViewById(R.id.username);
        EditText password=(EditText) findViewById(R.id.password);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                String USERNAME=username.getText().toString();
                String PASSWORD=password.getText().toString();
                if(USERNAME.equals("ABC1") && PASSWORD.equals("ABC1") || USERNAME.equals("ABC2") && PASSWORD.equals("ABC2") || USERNAME.equals("ABC3") && PASSWORD.equals("ABC3")
                        || USERNAME.equals("ABC3") && PASSWORD.equals("ABC3") || USERNAME.equals("ABC4") && PASSWORD.equals("ABC4") || USERNAME.equals("ABC5") && PASSWORD.equals("ABC5")){

                    Toast.makeText(MainActivity.this,USERNAME+" -"+PASSWORD+"Login",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),NoticePanel.class);
                    intent.putExtra("User",USERNAME);
                    startActivity(intent);

                }
                else {
                    Toast.makeText(MainActivity.this,"Please Check Your UserName And Password ",Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}