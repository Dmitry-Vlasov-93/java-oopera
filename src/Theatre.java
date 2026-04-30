

public class Theatre {

    public static void main(String[] args) {
        System.out.println("Поехали!");
        Actor actor1 = new Actor("Vasya", "Pupkin", Gender.MALE, 180);
        Actor actor2 = new Actor("Lida", "Pupkina", Gender.FEMALE, 165);
        Actor actor3 = new Actor("Petr", "Solovev", Gender.MALE, 179);
        Director director1 = new Director("Oleg", "Vlasov", Gender.MALE, 40);
        Director director2 = new Director("Georgii", "Orlov", Gender.FEMALE, 40);
        Person musicAuthor = new Person("Nikita", "Sazin", Gender.MALE);
        Person choreographer = new Person("Liza", "Sokolova", Gender.FEMALE);
        Show show = new Show("New", 40, director2);
        Opera opera = new Opera(musicAuthor,"Text", "OperA", 50, director1, 15 );
        Ballet ballet = new Ballet(musicAuthor,"text","ballet",30, director1, choreographer);

        show.addActor(actor1);
        show.addActor(actor2);
        opera.addActor(actor3);
        opera.addActor(actor1);
        ballet.addActor(actor2);
        ballet.addActor(actor3);

        show.printActorsList();
        ballet.printActorsList();
        opera.printActorsList();

        show.changeActor(actor3, "Pupkin");
        show.printActorsList();

        opera.changeActor(actor2,"Mongolov");

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
