
import java.util.Scanner;
public class Person {   
public void getSkin(String skin) {
        System.out.println(skin);
    }

    public void getHeight(String height) {
        System.out.println(height);
    }

    public void getSense(String sense) {
        System.out.println(sense);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.getSkin("Blonde");
        person.getHeight("Avarage");
        person.getSense("Intelligence");

    }
}


