package com.mmj.www.newexplicitintent3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btnSecond = findViewById(R.id.btnSecond);
        btnSecond.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.btnSecond){
            Intent intentsecond = new Intent(this,ThirdActivity.class);
            startActivity(intentsecond);
        }

    }
}
