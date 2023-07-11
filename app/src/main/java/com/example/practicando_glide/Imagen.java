package com.example.practicando_glide;

public class Imagen {

    private String item;
    private String url;

    public Imagen(String item, String url) {
        this.item = item;
        this.url = url;
    }
    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
