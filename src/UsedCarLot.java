import java.util.ArrayList;

/**
 * This class represents a UsedCarLot object
 *
 * @author Jimmy Li
 */
public class UsedCarLot {
    /** The inventory of the UsedCarLot */
    private ArrayList<Car> inventory;

    /**
     * Instantiates a UsedCarLot object.
     */
    public UsedCarLot() {
        inventory = new ArrayList<Car>();
        System.out.print("Car Lot Created!\n");
    }

    /**
     * Returns the current inventory of the UsedCarLot.
     *
     * @return The inventory of UsedCarLot
     */
    public ArrayList<Car> getInventory() {
        return inventory;
    }

    /**
     * Adds a Car object to the inventory for UsedCarLot
     *
     * @param car The car being added to UsedCarLot
     */
    public void addCar(Car car) {
        inventory.add(car);
    }

    /**
     * Swap the position of two Cars (if possible) and returns a boolean stating if it was successful
     *
     * @param index1 The index of the first car being swapped
     * @param index2 The index of the second car being swapped
     * @return A boolean stating if the swap of two Cars was successful
     */
    public boolean swap(int index1, int index2) {
        if (index1 > inventory.size() - 1 || index2 > inventory.size() - 1 || index1 < 0 || index2 < 0) {
            return false;
        }
        Car swapCar = inventory.get(index1);
        inventory.set(index1, inventory.get(index2));
        inventory.set(index2, swapCar);
        return true;
    }

    /* Adds a Car to the inventory list at the index specified
    by indexToAdd; this method increases the size of inventory by 1
    PRECONDITION: 0 <= indexToAdd < inventory.size()
    DUE TO THIS PRECONDITION, you do NOT need to check for boundary errors
    like you did the other addCar method; also note that this method is void
*/

    /**
     * Adds a Car to the inventory list at the index specified
     * by indexToAdd; this method increases the size of inventory by 1
     * <p>
     * PRECONDITION: 0 &lt;= indexToAdd &lt; inventory.size()
     *
     * @param indexToAdd The index that car is being added to
     * @param carToAdd The car that is being added to UsedCarLot
     */
    public void addCar(int indexToAdd, Car carToAdd)
    {
        /* IMPLEMENT ME */
        inventory.add(indexToAdd, carToAdd);
    }

    /* "sells" the Car located at indexOfCarToSell which
        removes it from the inventory list and shifting the remaining
        Cars in the inventory list to the left to fill in the gap;
        this method reduces the size of inventory by 1

        Returns the Car that is being "sold" (removed from lot)

        PRECONDITION: indexOfCarToSell < inventory.size()

        HINT: the ArrayList remove() method returns the removed element while also
              removing it from the ArrayList
      */

    /**
     * "sells" the Car located at indexOfCarToSell which
     * removes it from the inventory list and shifting the remaining
     * Cars in the inventory list to the left to fill in the gap;
     * this method reduces the size of inventory by 1
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell the index of the Car being sold
     * @return the Car that is being "sold" (removed from lot)
     */
    public Car sellCarShift(int indexOfCarToSell)
    {
        /* IMPLEMENT ME */
        Car sold = inventory.get(indexOfCarToSell);
        inventory.remove(indexOfCarToSell);
        return sold;
    }

    /* "sells" the Car located at indexOfCarToSell,
       but instead of removing it and shifting the inventory
       list to the left, REPLACE the Car at indexOfCarToSell
       with NULL, thus creating an "empty parking spot" on the lot;
       this method does NOT reduce the size of inventory by 1

       PRECONDITION: indexOfCarToSell < inventory.size()

       This method returns the Car that is being "sold" (replaced with null)
     */

    /**
     * "sells" the Car located at indexOfCarToSell,
     * but instead of removing it and shifting the inventory
     * list to the left, REPLACE the Car at indexOfCarToSell
     * with NULL, thus creating an "empty parking spot" on the lot;
     * this method does NOT reduce the size of inventory by 1
     * <p>
     * PRECONDITION: indexOfCarToSell &lt; inventory.size()
     *
     * @param indexOfCarToSell The index of the car being sold
     * @return The Car that is being "sold" (replaced with null)
     */
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        /* IMPLEMENT ME */
        Car sold = inventory.get(indexOfCarToSell);
        inventory.set(indexOfCarToSell, null);
        return sold;
    }

    /* moves Car located at index indexOfCarToMove to index destinationIndex;
       if destinationIndex > indexOfCarToMove, moves the Car to the right in
       inventory; if destinationIndex < indexOfCarToMove, moves the
       Car to the left in the inventory. All other cars in the inventory
       should shift accordingly

       PRECONDITIONS: indexOfCarToMove < inventory.size()
                      destinationIndex < inventory.size()
     */

    /**
     * moves Car located at index indexOfCarToMove to index destinationIndex;
     * if destinationIndex > indexOfCarToMove, moves the Car to the right in
     * inventory; if destinationIndex &lt; indexOfCarToMove, moves the
     * Car to the left in the inventory. All other cars in the inventory
     * should shift accordingly
     * <p>
     * PRECONDITIONS: indexOfCarToMove &lt; inventory.size()
     *                destinationIndex &lt; inventory.size()
     *
     * @param indexOfCarToMove The index of the car being moved
     * @param destinationIndex The index of where the car is being moved to
     */
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        /* IMPLEMENT ME */
        Car move = inventory.get(indexOfCarToMove);
        inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, move);
    }
}
