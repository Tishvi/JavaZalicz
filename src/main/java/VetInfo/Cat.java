package VetInfo;
/**
 * Holds cats specific information and functionality
 */
public class Cat extends Animal {
    public Cat(int age, int weight, boolean sex, String name, String race) {
        super(age, weight, sex, name, race);
    }
    /**
     * This checks if the cat that's put into system is overweight
     * Compares weight of our cat to upper-limit seen as accepted by doctors
     */
    @Override public boolean isOverweight(){
        if(getWeight() >= 7){
            return true;
        }
        return false;
    }
}
