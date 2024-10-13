package model;

public class Book {
    private final String title;
    private final String author;
    private final int code;
    private final int value;
    private boolean available;

    public Book(String title, String author, int code, int value) {
        this.title = title;
        this.author = author;
        this.code = code;
        this.available = true;
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getCode() {
        return code;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.format("%s by %S", title, author);
    }
}
