package com.ttq.creative.car_check;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class start_page extends AppCompatActivity {
 private Button signUpBtn;
 private Button visit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        signUpBtn = (Button) findViewById(R.id.sign_up);
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(start_page.this, sign_up.class);
                startActivity(i);
            }
        });

        visit =(Button) findViewById(R.id.visit);
        visit.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View v){
                Intent b = new Intent(start_page.this, welcome.class);
                startActivity(b);
            }
        });
    }
}
