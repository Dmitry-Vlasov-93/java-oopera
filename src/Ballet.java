

public class Ballet extends MusicalShow{
    Person choreographer;

    public Ballet(Person musicAuthor, String librettoText, String title, int duration,
                  Director director, Person choreographer) {
        super(musicAuthor, librettoText, title, duration, director);
        this.choreographer = choreographer;
    }
}
