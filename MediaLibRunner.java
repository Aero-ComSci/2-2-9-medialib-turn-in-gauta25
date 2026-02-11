/*
 * Activity 2.2.7
 * 
 * The runner for the MediaLib program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    // System.out.println("Welcome to your Media Library");
    // MediaLib myLib = new MediaLib();
    // Book myBook = new Book("The Lord of the Rings", "Tolkien");
    // System.out.println("Book added: " + myBook);
    // myLib.addBook(myBook);

    // // CODE TO ADD
    // int myRating = 5;
    // myBook.adjustRating(myRating);
    // System.out.println(myBook);


    // Book currBook = myLib.getBook();
    // currBook.setTitle("My Favorite Book");
    // System.out.println("Current book: " + currBook);




    // // New library and new book
    // System.out.println("You have a NEW Library");
    // MediaLib myLib2 = new MediaLib();

    // Book newBook = new Book("To Kill a Mockingbird", "Lee");
    // myLib2.addBook(newBook);
    // // System.out.println(myLib2);
    // newBook = new Book("1984", "Orwell");
    // myLib2.addBook(newBook);

    // // CODE TO ADD
    // // System.out.println("before test:" + newBook);
    // // myLib.testBook(newBook);
    // // System.out.println("after test:" + newBook);

    // // Comparing books
    // Book anotherBook = new Book("1984", "Orwell");
    // System.out.println("Comparing books:");
    // // System.out.println("Library:\n" + myLib);
    // System.out.println("Books are equal? --> " + myBook.equals(anotherBook));
    // System.out.println("Changing title and author then comparing again . . .");
    // anotherBook.setTitle("My Favorite Book");
    // anotherBook.setAuthor("Tolkien");
    // System.out.println("Books are equal? --> " + myBook.equals(anotherBook));
    // System.out.println("Another book: " + anotherBook);
    // System.out.println("Mybook: " + myBook);

    // System.out.println("\n\n\n\n\nTesting Movie class");

    // Movie DespicableMe = new Movie("Despicable Me", 1.5);
    // Movie DespicableMeCOPY = new Movie("Despicable Me", 1.5);
    // Movie Titanic = new Movie("Titanic", 3.25);

    // myLib.addMovie(DespicableMe);
    // myLib2.addMovie(DespicableMeCOPY);
    // System.out.println(myLib.getMovie());
    // System.out.println("(toString test: Library: " + myLib);
    // System.out.println("Equals test: " + DespicableMe.equals(DespicableMeCOPY));

    System.out.println(MediaLib.getOwner() + "'s Library");
    
    System.out.println(MediaLib.changeOwner("Bob"));

    MediaLib.owner = "Changed";
    System.out.println(MediaLib.getOwner() + "'s Library");

    MediaLib.numBooks++;
    MediaLib.numMovies++;
    MediaLib.numSongs++;
    MediaLib.numEntries += 3;
    System.out.println("BOOKS: " + MediaLib.getNumBooks());
    System.out.println("MOVIES: " + MediaLib.getNumMovies());
    System.out.println("SONGS: " + MediaLib.getNumSongs());
    System.out.println("ALL ENTRIES: " + MediaLib.getNumEntries());
  }
}