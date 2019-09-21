package com.example.lab2singh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText c1, c2, c3, c4, c5, c6, c7, c8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);
        c7 = findViewById(R.id.c7);
        c8 = findViewById(R.id.c8);

    }

    public void nextActivity(View v)
    {
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }

    public void saveData(View v)
    {
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        String c1SP = c1.getText().toString();
        String c2SP = c2.getText().toString();
        String c3SP = c3.getText().toString();
        String c4SP = c4.getText().toString();
        String c5SP = c5.getText().toString();
        String c6SP = c6.getText().toString();
        String c7SP = c7.getText().toString();
        String c8SP = c7.getText().toString();

        editor.putString("course 1", c1SP);
        editor.putString("course 2", c2SP);
        editor.putString("course 3", c3SP);
        editor.putString("course 4", c4SP);
        editor.putString("course 5", c5SP);
        editor.putString("course 6", c6SP);
        editor.putString("course 7", c7SP);
        editor.putString("course 8", c8SP);
        editor.commit();

        Toast.makeText(this, "Data was saved", Toast.LENGTH_SHORT).show();


    }
}
