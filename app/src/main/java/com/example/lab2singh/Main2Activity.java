package com.example.lab2singh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText courseCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        courseCheck = findViewById(R.id.courseCheck);
    }

    public void back(View v)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void check(View v)
    {
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        String c1SP = sp.getString("course 1", null);
        String c2SP = sp.getString("course 2", null);
        String c3SP = sp.getString("course 3", null);
        String c4SP = sp.getString("course 4", null);
        String c5SP = sp.getString("course 5", null);
        String c6SP = sp.getString("course 6", null);
        String c7SP = sp.getString("course 7", null);
        String c8SP = sp.getString("course 8", null);


        String cc = courseCheck.getText().toString();

        if((cc.equals(c1SP)) || (cc.equals(c2SP)) || (cc.equals(c3SP)) ||
                (cc.equals(c4SP)) || (cc.equals(c5SP)) || (cc.equals(c6SP)) ||
                (cc.equals(c7SP)) || (cc.equals(c8SP)))
        {
            Toast.makeText(this, "Course is offered in UST", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Course is NOT offered in UST", Toast.LENGTH_SHORT).show();

        }



    }
}
