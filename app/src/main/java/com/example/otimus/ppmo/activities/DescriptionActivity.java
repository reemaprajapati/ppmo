package com.example.otimus.ppmo.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.otimus.ppmo.R;

public class DescriptionActivity extends AppCompatActivity {
Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);




        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DescriptionActivity.this,WishlistItems.class);
                startActivity(intent);
            }
        });

    }
}
