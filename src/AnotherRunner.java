import java.util.ArrayList;
import java.util.Arrays;

public class AnotherRunner {
    public static void main(String[] args) {
        Integer[] intsArray = {1, 2, 3, 4, 5,};
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intsArray));
        System.out.println(intList);

        Car car1 = new Car("Mustang", 12500);
        Car car2 = new Car("Camry", 8400);
        Car car3 = new Car("Ram", 17200);
        Car[] carsArray = {car1, car2, car3};
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(carsArray));
        System.out.println(carList);
    }
}
