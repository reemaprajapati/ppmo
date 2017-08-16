package com.example.otimus.ppmo.activities;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.otimus.ppmo.R;

public class WishlistItems extends AppCompatActivity {

    private FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist_items);

        fab=(FloatingActionButton)findViewById(R.id.fabicon);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(WishlistItems.this,NotificationActivity.class);
                startActivity(intent);
            }
        });
    }
}
