package com.example.asa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class asa1 extends AppCompatActivity {
    String mobile,email;
    EditText edtmobile,edtemail;
    Button btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asa1);
        edtmobile = findViewById(R.id.edtmobile);
        edtemail = findViewById(R.id.edtemail);
        btnregister= findViewById(R.id.btnregister);

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mobile = edtmobile.getText().toString();
                email= edtemail.getText().toString();

                Intent intent=new Intent(asa1.this,asa2.class);
                intent.putExtra("mobile",mobile);
                intent.putExtra("email",email);
                startActivity(intent);

            }
        });
    }
}