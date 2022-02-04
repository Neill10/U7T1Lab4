import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList dogList = new ArrayList();
        Dog dog1 = new Dog("Spot");
        Dog dog2 = new Dog("Benny");
        dogList.add(dog1);
        dogList.add(dog2);
        Dog d = (Dog)dogList.get(0);
        d.bark();



        /*
        ArrayList<String> list = new ArrayList<String>();
        list.add("bruh");
        list.add("bruhhhhhhhhhhhhhhhhh");

        //toString method
        System.out.println(list);

        //size method
        System.out.println(list.size());

        // get method
        System.out.println(list.get(0));

        // set method (returns the name being replaced)
        System.out.println(list.set(0,"Neil"));

        // add method
        list.add(1, "challenged");

        System.out.println(list);
         */
    }
}
