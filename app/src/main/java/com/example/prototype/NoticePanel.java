package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class NoticePanel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice_panel);

        TextView Userinfo=(TextView) findViewById(R.id.loginInfo);

        Intent secondintent=getIntent();

        String userName=secondintent.getStringExtra("User");

        Userinfo.setText("You Logged In As "+userName);




    }

    public void n1(View view) {
       // Toast.makeText(NoticePanel.this,"Notice One",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),NoticeOne.class);
        startActivity(intent);
    }

    public void n2(View view) {
        //Toast.makeText(NoticePanel.this,"Notice  2",Toast.LENGTH_SHORT).show();
        Intent intent1 = new Intent(getApplicationContext(),NoticeSecond.class);
        startActivity(intent1);
    }

    public void n3(View view) {
        //Toast.makeText(NoticePanel.this,"Notice  3",Toast.LENGTH_SHORT).show();
        Intent intent2 = new Intent(getApplicationContext(),NoticeThree.class);
        startActivity(intent2);
    }
    public void n4(View view) {
        //Toast.makeText(NoticePanel.this,"Notice  4",Toast.LENGTH_SHORT).show();
        Intent intent3 = new Intent(getApplicationContext(),NoticeFour.class);
        startActivity(intent3);
    }
    public void n5(View view) {
        Toast.makeText(NoticePanel.this,"Notice  5",Toast.LENGTH_SHORT).show();
    }
    public void exit(View view) {
        Toast.makeText(NoticePanel.this,"Notice  6",Toast.LENGTH_SHORT).show();
    }
    public void Logout(View view) {
        Toast.makeText(NoticePanel.this,"Notice  7",Toast.LENGTH_SHORT).show();
    }
}