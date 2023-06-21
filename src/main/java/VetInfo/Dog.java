package VetInfo;

public class Dog extends Animal {

    public Dog(int age, int weight, boolean sex, String name, String race) {
        super(age, weight, sex, name, race);
    }
    @Override public boolean isOverweight(){
        if (getWeight() >= 20){
            return true;
        }
        return false;
    }
}
