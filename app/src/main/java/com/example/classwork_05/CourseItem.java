package com.example.classwork_05;

public class CourseItem {
    private String title;
    private String subtitle;
    private boolean isSelected;

    public CourseItem(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;

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
}
