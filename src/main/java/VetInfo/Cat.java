package VetInfo;

public class Cat extends Animal {
    public Cat(int age, int weight, boolean sex, String name, String race) {
        super(age, weight, sex, name, race);
    }
    @Override public boolean isOverweight(){
        if(getWeight() >= 7){
            return true;
        }
        return false;
    }
}
