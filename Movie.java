public class Movie
{
    private String title;
    private double duration; // in hours
    private int rating; // from 1 to 10

    /*** Constructor ****/
  public Movie(String t, double d)
  {
    this.title = t;
    this.duration = d;
    this.rating = 0;
  }
  
   /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public double getDuration() {
    return duration;
  }
  
  public int getRating() {
    return rating;
  }
  
  public String toString() 
  {
    String info = "\"" + title + "\", duration is " + duration + " hours";
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

  public void setDuration(double d) {
    duration = d;
  }

  public void adjustRating(int r) {
    if (rating + r >= 0 && rating + r <= 10) {
      rating += r;
    }
  }

  public boolean equals(Movie m) {
    return (this.title.equals(m.title) && this.duration == m.duration);
  }
  }