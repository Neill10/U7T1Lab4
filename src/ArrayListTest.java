import java.util.ArrayList;

public class ArrayListTest
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(3);
        System.out.println(numList);
        numList.add(numList.indexOf(3), 6);
        System.out.println(numList);
        numList.add(7);
        System.out.println(numList);
        numList.add(numList.indexOf(3)+1,8);
        System.out.println(numList);
        numList.set(3,9);
        System.out.println(numList);
        numList.add(numList.indexOf(6)+1,2 );
        System.out.println(numList);
        System.out.println(numList.size()-1);
        numList.remove(4);
        System.out.println(numList);
        numList.set(numList.size()-1,0);
        System.out.println(numList);

   }
}
