

public class MusicalShow extends Show{
    Person musicAuthor;
    String librettoText;

    public MusicalShow(Person musicAuthor, String librettoText, String title, int duration,
                       Director director){
        super(title, duration, director);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public void printLibrettoText(){
        System.out.println(librettoText);
    }
}
