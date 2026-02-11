public class Song
{
    private String title;
    private int rating; // from 1 to 10

    /*** Constructor ****/
  public Song(String t)
  {
    this.title = t;
    this.rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }
  
  public int getRating() {
    return rating;
    }

  public String toString() 
  {
    String info = "\"" + title;
    if (rating != 0) 
    { 
      info += ", rating is " + rating;
    }
    return info;
  }

  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

  public void adjustRating(int r) {
    if (rating + r >= 0 && rating + r <= 10) {
      rating += r;
    }
  }

  public boolean equals(Song s) {
    return (this.title.equals(s.title));
  }
  }