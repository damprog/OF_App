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
import com.example.of_app.data.model.ProjectModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProjectsActivity extends AppCompatActivity {

    private ArrayAdapter<String> adapter;
    private ListView projectsListLV;
    private ProjectModel p1 = new ProjectModel("Projekt 1 z klasy");
    private ProjectModel p2 = new ProjectModel("Projekt 2 z klasy");
    private List<String> projectNameList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projects);

//        projectsListLV = findViewById(R.id.projectsListLV);
//        String[] st = {"projekt1", "projekt2", "projekt3"};
//        ArrayList<String> pList = new ArrayList<>();
//        pList.addAll(Arrays.asList(st));
//        adapter = new ArrayAdapter<String>(this, R.layout.row, pList);
//        projectsListLV.setAdapter(adapter);

        projectNameList.add(p1.getProjectName());
        projectNameList.add(p2.getProjectName());
        final TextView projectsListTV = findViewById(R.id.projectsListTV);
        projectsListTV.setText(projectNameList.toString());

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