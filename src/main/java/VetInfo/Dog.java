package VetInfo;

/**
 * Holds dogs specific information and functionality
 */

public class Dog extends Animal {

    public Dog(int age, int weight, boolean sex, String name, String race) {
        super(age, weight, sex, name, race);
    }
    /**
     * This checks if the dog that's put into system is overweight
     * Compares weight of our dog to upper-limit seen as accepted by doctors
     */
    @Override public boolean isOverweight(){
        if (getWeight() >= 20){
            return true;
        }
        return false;
    }
}
