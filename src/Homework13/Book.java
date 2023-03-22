package Homework13;

public class Book {
    private String bookName;
    private Author authorName;
    private int publishingYear;

    public Book(String bookName, Author authorName, int publishingYear){
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public Book(String bookName, String name, int publishingYear) {
    }

    public String getBookName(){
        return this.bookName;
    }

    public Author getAuthorName(){
        return this.authorName;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book name is: "+this.bookName+" . Author name is "+this.authorName+" . Publishing year is "+this.publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()){
            return false;
        }
        Book b2 = (Book) other;
        return bookName.equals(b2.bookName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }

}
