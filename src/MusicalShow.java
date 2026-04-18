

public class MusicalShow extends Show{
    private Person musicAuthor;
    private String librettoText;

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
