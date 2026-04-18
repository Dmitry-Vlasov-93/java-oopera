import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director){
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printActorsList(){
        for (Actor actor : listOfActors){
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor){
        if(listOfActors.contains(actor)){
            System.out.println("Данный актер уже играет в этом спектакле.");
        }else{
            listOfActors.add(actor);
            System.out.println("Актер успешно добавлен.");
        }
    }

    public void changeActor(Actor actor, String surname){
        for (Actor oldActor : listOfActors ){
            if(oldActor.getSurname().equals(surname)){
                listOfActors.set(listOfActors.indexOf(oldActor),actor);
                System.out.println("Актер успешно заменен.");
                return;
            }
        }
        System.out.println("Актер не найден.");
    }

    public void printDirector(){
        System.out.println(director);
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}
