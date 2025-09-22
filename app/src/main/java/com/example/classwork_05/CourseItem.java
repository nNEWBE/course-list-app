package com.example.classwork_05;

public class CourseItem {
    private String title;
    private String subtitle;
    private int semester;
    private boolean isSelected;

    public CourseItem(String title, String subtitle, int semester) {
        this.title = title;
        this.subtitle = subtitle;
        this.semester = semester;
        this.isSelected = false;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
    
    public int getSemester() {
        return semester;
    }
}
