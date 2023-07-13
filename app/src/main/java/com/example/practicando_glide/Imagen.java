package com.example.practicando_glide;

import android.content.ClipData;

public class Imagen {

    protected String text;
    protected String url;

    public Imagen(String text, String url) {
        this.text = text;
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

