package com.uninassau.recyclerquran;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Versicle implements Serializable {

    @SerializedName("chapter")
    private int chapter;

    @SerializedName("verse")
    private int verse;

    @SerializedName("text")
    private String text;



    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getChapter() {
        return chapter;
    }

    public void setChapter(int chapter) {
        this.chapter = chapter;
    }

    public int getVerse() {
        return verse;
    }

    public void setVerse(int verse) {
        this.verse = verse;
    }
}