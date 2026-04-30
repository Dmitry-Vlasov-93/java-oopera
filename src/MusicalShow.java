

public class MusicalShow extends Show{
    private final Person musicAuthor;
    private final String librettoText;

    public MusicalShow(Person musicAuthor, String librettoText, String title, int duration,
                       Director director){
        super(title, duration, director);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public void printLibrettoText(){
        System.out.println(librettoText);
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }
}
