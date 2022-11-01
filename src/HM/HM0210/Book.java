package HM.HM0210;

/*
Write Book class that will have instance variables and 2 Constructors.
While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
 */

public class Book {
    String name;
    int pages;
    String author;

    public Book(String name,int pages) {
        this.name = name;
        this.pages = pages;
    }

    public Book(String name, int pages,String author) {
        this(name,pages);
        this.author = author;
    }

    public void printInfo(){
        System.out.println("Name"+name+" Have "+pages+" pages and wrote by "+author);
    }

    public static void main(String[] args) {
        Book HarryPotter=new Book("Harry Potter",545,"Joanne Rowling");
        HarryPotter.printInfo();

        Book  AtlasShrugged=new Book("Atlas Shrugged",767);
        AtlasShrugged.printInfo();
    }
}
