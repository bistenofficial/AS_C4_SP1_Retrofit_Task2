package com.example.as_c4_sp1_retrofit_task2;

public class APOD
{
    private String copyright;
    private String date;
    private String title;
    private String explanation;
    public APOD (String copyright,String date,String explanation) {
        this.copyright = copyright;
        this.date = date;
        this.explanation = explanation;
    }
    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCopyright()
    {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }
}
