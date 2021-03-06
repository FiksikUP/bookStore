package org.example.web.dto;

import javax.validation.constraints.*;

public class Book {
    private Integer id;
    @NotBlank()
    @Size(max = 50)
    private String author;
    @NotBlank()
    @Size(max = 100)
    private String title;
    @NotNull
    @Min(1)
    @Max(9999)
    private Integer size;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", size=" + size +
                '}';
    }

    public boolean isNull() {
        return  this.getAuthor().trim().equals("") &&
                this.getTitle().trim().equals("") &&
                this.getSize() == null;
    }
}
