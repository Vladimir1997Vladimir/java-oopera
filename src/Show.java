import java.security.PublicKey;
import java.util.ArrayList;

public class Show {
    protected String title; // название
    protected int duration; //длительность в минутах
    protected Director director; //режиссер
    protected ArrayList<Actor> listOfActors; //список актеров

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printDirectorInfo() {
        System.out.println(director.name + " " + director.surname);
    }

    public void printActorsList() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.name + " " + actor.surname + "(" + actor.getHeight() + ")");
        }
    }

    public void addActor(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.equals(newActor)){
                System.out.println("Такой актер уже есть.");
                return;
            }
        }
        listOfActors.add(newActor);
    }

    public void replaceActor(Actor newActor, String oldSurname) {
        for(int i = 0; i < listOfActors.size(); i++) {
            if(listOfActors.get(i).surname.equals(oldSurname)) {
                listOfActors.set(i, newActor);
                return;
            }
        }
        System.out.println("Актер с фамилией: " + oldSurname + " отсутствует в спектакле");
    }
}

