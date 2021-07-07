package com.example.of_app.data.model;

public class FormModel {
    private String formName;
    private String formId;
    private String projectId;
    private String userId;
    private String date;
    private String muff;
    private String material;
    private String caseQuantity;
    private String pigtailQuantity;
    private String spliter;
    private String dropType;
    private String additionalWarnings;

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMuff() {
        return muff;
    }

    public void setMuff(String muff) {
        this.muff = muff;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getCaseQuantity() {
        return caseQuantity;
    }

    public void setCaseQuantity(String caseQuantity) {
        this.caseQuantity = caseQuantity;
    }

    public String getPigtailQuantity() {
        return pigtailQuantity;
    }

    public void setPigtailQuantity(String pigtailQuantity) {
        this.pigtailQuantity = pigtailQuantity;
    }

    public String getSpliter() {
        return spliter;
    }

    public void setSpliter(String spliter) {
        this.spliter = spliter;
    }

    public String getDropType() {
        return dropType;
    }

    public void setDropType(String dropType) {
        this.dropType = dropType;
    }

    public String getAdditionalWarnings() {
        return additionalWarnings;
    }

    public void setAdditionalWarnings(String additionalWarnings) {
        this.additionalWarnings = additionalWarnings;
    }

    public FormModel(String formName) {
        this.formName = formName;
    }
}
