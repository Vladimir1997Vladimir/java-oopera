public class Actor extends Person{
    public int height; //рост

    public Actor(String name, String surname, Gender gender, int height) {
       super(name, surname, gender);
        this.height = height;
    }
}
