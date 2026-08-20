import java.util.Objects;

public class Actor extends Person{

    private int height; //рост

    public Actor(String name, String surname, Gender gender, int height) {
       super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return height == actor.height &&
                name.equals(actor.name) &&
                surname.equals(actor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, height);
        //не написал бы это сам явно. Не понимаю почему через автозаполнение можно выбрать было только рост.
        //а остальные два параметра из Person не было в автовыборе
    }
}
