package com.example.otimus.ppmo.activities;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.otimus.ppmo.R;
import com.example.otimus.ppmo.adapters.PreferencesItemAdapter;
import com.example.otimus.ppmo.model.Category;
import com.example.otimus.ppmo.model.Settings;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class NotificationActivity extends ActionBarActivity{

    private LinearLayoutManager lLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        setTitle(null);


        List<Settings> list = getAllItemList();
        lLayout = new LinearLayoutManager(NotificationActivity.this);

        RecyclerView rView = (RecyclerView)findViewById(R.id.recycler_view);
        rView.setLayoutManager(lLayout);

        PreferencesItemAdapter rcAdapter = new PreferencesItemAdapter(NotificationActivity.this, list);
        rView.setAdapter(rcAdapter);


    }



//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//        if(id == R.id.action_refresh){
//            Toast.makeText(MainActivity.this, "Refresh App", Toast.LENGTH_LONG).show();
//        }
//        if(id == R.id.action_new){
//            Toast.makeText(MainActivity.this, "Create Text", Toast.LENGTH_LONG).show();
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    private List<Settings> getAllItemList(){

        List<Settings> list = new ArrayList<Settings>();
        list.add(new Settings("Your category","Select your category"));
        list.add(new Settings("Notification Time","1 day before"));
        list.add(new Settings("Notification sound",""));

        return list;
    }
}

