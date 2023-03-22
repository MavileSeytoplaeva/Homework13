package Homework13;
public class main {
    public static void main(String[] args){
        Author timeRidersAuthor = new Author("Jack", "Scarrow");
        Book timeRiders = new Book("TimeRiders", timeRidersAuthor, 2010);
        Book timeRiders1 = new Book("TimeRiders", timeRidersAuthor, 2010);
        System.out.println(timeRiders.getBookName()+" "+timeRidersAuthor.getName()+" "+timeRidersAuthor.getLastName()+" "+timeRiders.getPublishingYear());
        Author consueloAuthor = new Author("George", "Sand");
        Book consuelo = new Book("Consuelo", consueloAuthor, 1843);
        System.out.println(consuelo.getBookName()+" "+consueloAuthor.getName()+" "+consueloAuthor.getLastName()+" "+consuelo.getPublishingYear());
        consuelo.setPublishingYear(2023);
        System.out.println(consuelo.getBookName()+" "+consueloAuthor.getName()+" "+consueloAuthor.getLastName()+" "+consuelo.getPublishingYear());
    }
}