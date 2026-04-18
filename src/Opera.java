

public class Opera extends MusicalShow{
    private final int choirSize;

    public Opera(Person musicAuthor, String librettoText, String title, int duration,
                 Director director, int choirSize) {
        super(musicAuthor, librettoText, title, duration, director);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }
}
