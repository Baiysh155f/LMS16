import java.util.logging.SocketHandler;

public class Main {
    public static void main(String[] args) {

        Animal[] an = {new Shark(), new Turtle(), new Eagle()};

        for (Animal ani : an) {
            if (ani.getClass().equals(Turtle.class)) {
                Turtle.swim();
            }
            if (ani.getClass().equals(Shark.class)) {
                Shark.attack();
            }
            if (ani.getClass().equals(Eagle.class)) {
                Eagle.fly();
            }
        }
        System.out.println();
        Turtle[] turtles = {};
        System.out.println(turtles instanceof Turtle[]);

        Shark[] sharks = {};
        System.out.println(sharks instanceof Shark[]);

        Eagle[] eagles = {};
        System.out.println(eagles instanceof Eagle[]);
    }
}