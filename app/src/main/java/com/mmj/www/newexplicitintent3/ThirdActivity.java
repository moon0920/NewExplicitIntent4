package com.mmj.www.newexplicitintent3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Button btnThird = findViewById(R.id.btnThird);
        btnThird.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnThird){
            Intent intentthird = new Intent(this,MainActivity.class);
            startActivity(intentthird);
        }

    }
}
