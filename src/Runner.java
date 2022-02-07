import java.lang.reflect.Array;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
//        ArrayList<Integer> ints = new ArrayList<Integer>();
//        ints.add(10);
//        ints.add(5);
//        ints.add(24);
//        System.out.println(ints);
//
//        Integer num1 = new Integer(5);
//        Integer num2 = 10;
//        int num3 = 15;
//
//        ArrayList<Integer> numList = new ArrayList<Integer>();
//
//        numList.add(num1);
//        numList.add(num2);
//        numList.add(num3);
//
//        int sum = num1 + num2 + num3;
//
//        numList.add(sum);
//
//        System.out.println(numList);

//        ArrayList<String> letters = new ArrayList<String>();
//
//        letters.add("A");
//        letters.add("B");
//        letters.add("C");
//        System.out.println(letters);
//        System.out.println(letters.size());
//        letters.add(0, "D");
//        System.out.println(letters);
//        System.out.println(letters.size());
//        letters.add(3, "E");
//        System.out.println(letters);
//        System.out.println(letters.size());
//        letters.add(1, "F");
//        letters.add(1, "G");
//        letters.add(1, "H");
//        System.out.println(letters);
//        System.out.println(letters.size());
//        System.out.println("-------------");
//        letters.remove(2);
//        System.out.println(letters);
//        System.out.println(letters.size());
//        letters.remove(3);
//        System.out.println(letters);
//        System.out.println(letters.size());
//        letters.remove(0);
//        letters.remove(1);
//        System.out.println(letters);
//        System.out.println(letters.size());
//        System.out.println("-------------");

        ArrayList<Integer> numList = new ArrayList<Integer>();
        // numList empty: []

        numList.add(3);      //numList: [3]

        numList.add(0, 6);  //numList: [6, 3]

        numList.add(7);

        numList.add(2, 8);

        numList.set(3, 9);

        numList.add(1, 2);

        numList.add(1, numList.size());

        numList.remove(4);

        numList.set(numList.size() - 1, 0);

        System.out.println(numList);
    }
}
