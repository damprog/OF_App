package com.example.of_app.data.model;

import java.util.ArrayList;
import java.util.List;

public class ProjectModel {
    private String projectName;
    private List<FormModel> formsList = new ArrayList<>();

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ProjectModel(String projectName) {
        this.projectName = projectName;
    }
}
