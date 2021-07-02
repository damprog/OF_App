package com.example.of_app;

import android.content.Intent;
import android.graphics.Paint;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class ProjectsActivity extends AppCompatActivity {

    private ArrayAdapter<String> adapter;
    private ListView projectsListLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

        projectsListLV = findViewById(R.id.projectsListLV);
        String[] st = {"projekt1", "projekt2", "projekt3"};
        ArrayList<String> pList = new ArrayList<>();
        pList.addAll(Arrays.asList(st));
        adapter = new ArrayAdapter<String>(this, R.layout.activity_projects, pList);
        projectsListLV.setAdapter(adapter);

        final Button newFormBtn = findViewById(R.id.newFormBtn);
        newFormBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ProjectsActivity.this, NewFormActivity.class);
                startActivity(intent);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}