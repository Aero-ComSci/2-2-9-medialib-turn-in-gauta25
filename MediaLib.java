/**
 * Activity 2.2.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  public static int numEntries = 0;
  private Book book;
  private Movie movie;
  public static String owner = "GAUTA";
  private Song song;
  public static int numBooks = 0;
  public static int numMovies = 0;
  public static int numSongs = 0;

  public void addBook(Book b)
  {
    book = b;
  }

  public void addMovie(Movie m) 
  {
    movie = m;
  }

  public void addSong(Song s)
  {
    song = s;
  }

  public String toString() 
  {
    String info = "";
    info+=book.toString();
    info+=movie.toString();
    info+=song.toString();
    return info;
  }

  public Book getBook()
  {
  return book;
  }

  public Movie getMovie() 
  {
    return movie;
  }

  public static String getOwner() {
    return owner;
  }
  
  public static int getNumBooks() {
    return numBooks;
  }

  public static int getNumMovies() {
    return numMovies;
  }

  public static int getNumSongs() {
    return numSongs;
  }

  public static int getNumEntries() {
    return numEntries;
  }

  public static String changeOwner(String newName) {
    owner = newName;
    return "New Owner: " + owner;
  }
  
  public void testBook(Book tester) {
    tester.setTitle("Changed Title");
    System.out.println("Inside testBook: " + tester);
  }

  
}