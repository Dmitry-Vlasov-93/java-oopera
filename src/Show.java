import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director){
        this.title = title;
        this.duration = duration;
        this.director = director;
    }

    public void printActorsList(){
        for (Actor actor : listOfActors){
            //System.out.println(actor.surname + " " + actor.name + " " + "(" + actor.height + ")" );
            //специально оставил, хочу спросить чем так плохо просто изначально так сделал и в printDirector тоже самое
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
            if(oldActor.surname.equals(surname)){
                listOfActors.set(listOfActors.indexOf(oldActor),actor);
                System.out.println("Актер успешно заменен.");
                return;
            }
        }
        System.out.println("Актер не найден.");
    }

    public void printDirector(){
        //System.out.println(director.surname +" "+ director.name);
        System.out.println(director);
    }
}
