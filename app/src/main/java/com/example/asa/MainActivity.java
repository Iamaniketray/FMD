package com.example.asa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NEXT();
                Toast.makeText(MainActivity.this, "NEXT PAGE", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,button.getClass());
               startActivity(intent);

            }
        });

    }

    public void NEXT(){
        Intent intent = new Intent (this,asa1.class) ;
        startActivity(intent);
    }
}