import java.awt.*;
import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Антон", "Кудряшкин", Gender.MALE, 185);
        Actor actor2 = new Actor("Павел", "Петров", Gender.MALE, 169);
        Actor actor3 = new Actor("Стелла", "Собачкина", Gender.FEMALE, 150);

        Director director1 = new Director("Иван", "Павлович", Gender.MALE, 10);
        Director director2 = new Director("Денис", "Любов", Gender.MALE, 10);

        String musicAuthor = "Чайковский";
        String choreographer = "Фокин";

        Show newShow1 = new Show("Кукушка", 45, director1, new ArrayList<>());
        Opera operaShow = new Opera("Кармен", 180, director2, new ArrayList<>(),
                musicAuthor, "История цыганки Кармен", 40);
        Ballet balletShow = new Ballet("Лебединое озеро", 140, director1, new ArrayList<>(),
                musicAuthor, "История о принцессе-лебеде", choreographer);

        System.out.println("Список актеров: ");
        newShow1.addActor(actor1);
        newShow1.addActor(actor2);
        newShow1.printActorsList();

        System.out.println("Список актеров: ");
        operaShow.addActor(actor3);
        operaShow.printActorsList();
        operaShow.printLibretto();

        System.out.println("Список актеров: ");
        balletShow.addActor(actor2);
        balletShow.addActor(actor3);
        balletShow.printActorsList();
        balletShow.printLibretto();

        //5пункт
        System.out.println("Заменим Собачкина в балете на Кудряшкин");
        balletShow.replaceActor(actor1, "Собачкина");
        System.out.println("Новые актеры в балете: ");
        balletShow.printActorsList();

        //Попробуйте заменить в другом спектакле несуществующего актёра
        System.out.println("Меняем Собачкина в опере на Лошков");
        operaShow.replaceActor(actor3, "Лошков");
        operaShow.printActorsList();
    }
}
