package com.example.shoty;

public class Book {

    private String Title;
    private String Category;
    private String Description;
    private String Author;
    private int Thumbnail ;

    public Book() {
    }

    public Book(String title, String category, String description, int thumbnail, String author) {
        Title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
        Author = author;
    }


    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getAuthor() {
        return Author;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }


    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
