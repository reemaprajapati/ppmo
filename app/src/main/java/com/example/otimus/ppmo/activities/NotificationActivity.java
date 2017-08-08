package com.example.otimus.ppmo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.otimus.ppmo.R;
import com.example.otimus.ppmo.adapters.PreferencesItemAdapter;
import com.example.otimus.ppmo.model.Settings;

import java.util.ArrayList;
import java.util.List;

public class NotificationActivity extends AppCompatActivity {

    ListView settingsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        settingsList=(ListView)findViewById(R.id.settingsList);

        List<Settings> list=new ArrayList<Settings>();

        list.add(new Settings("Your Category","Select your category"));
        list.add(new Settings("Notification","10 Minutes Before"));
        list.add(new Settings("Notification Sound",""));


        settingsList.setAdapter(new PreferencesItemAdapter(this,list));
    }
}

