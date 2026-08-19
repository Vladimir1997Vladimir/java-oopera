import java.security.PublicKey;
import java.util.ArrayList;

public class Show {
    public String title; // название
    public int duration; //длительность в минутах
    public Director director; //режиссер
    public ArrayList<Actor> listOfActors; //список актеров

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
            System.out.println(actor.name + " " + actor.surname + "(" + actor.height + ")");
        }
    }

    public void addActor(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (actor.name.equals(newActor.name) && actor.surname.equals(newActor.surname)
                    && actor.height == newActor.height) {
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

