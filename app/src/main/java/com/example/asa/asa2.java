package com.example.asa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class asa2 extends AppCompatActivity {
    String name,age,gender,sym,date,dis,st;

    EditText edtname,edtage,edtsym,edtdate,edtdis,edtst;
    RadioButton getSelectedItem;
    Button btndoctor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asa2);
        edtname= findViewById(R.id.edtname);
        edtage = findViewById(R.id.edtage);
        edtsym = findViewById(R.id.edtsym);
        edtdate = findViewById(R.id.edtdate);
        edtdis = findViewById(R.id.edtdis);
        edtst = findViewById(R.id.edtst);
        btndoctor= findViewById(R.id.btndoctor);

        btndoctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name=edtname.getText().toString();
                age=edtage.getText().toString();
                sym=edtsym.getText().toString();
                date=edtdate.getText().toString();
                dis=edtdis.getText().toString();
                st=edtst.getText().toString();


                Intent intent= new Intent(asa2.this,asa3.class);

                intent.putExtra("name",name);
                intent.putExtra("age",age);
                intent.putExtra("sym",sym);
                intent.putExtra("date",date);
                intent.putExtra("dis",dis);
                intent.putExtra("st",st);
                startActivity(intent);

            }
        });


    }
}