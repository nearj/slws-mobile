package com.example.slws.Model;

public class MyItem {
    private int icon;
    private String text;

    public MyItem(int icon, String text) {
        this.icon = icon;
        this.text = text;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getText() {
        return text;
    }
}
