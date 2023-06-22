package VetInfo;

public class Animal {
    private int age;
    private int weight;
    private boolean sex;
    private String name;
    private String race;

    /**
     *
     * @param age of an animal
     * @param weight of an animal
     * @param sex true -> male, false -> female
     * @param name of an animal
     * @param race of an animal
     */
    public Animal (int age, int weight, boolean sex, String name, String race){
            setAge(age);
            setWeight(weight);
            setSex(sex);
            setName(name);
            setRace(race);
    }

    /**
     * prints out information put about the animal
     */
    public void print(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("sex: " + getSexLiteral());
        System.out.println("race: " + race);
        System.out.println("weight: " + weight);
    }

    /**
     * prints out if the animal is healthy
     */
    public void printHealthStatus(){
        System.out.println("Overweight: " + isOverweight());
    }
    /**
     * This checks if the animal that's put into system is overweight
     */
    public boolean isOverweight(){
        return false;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isMale() {
        return sex;
    }

    /**
     * @return human-readable version of animal sex
     */
    public String getSexLiteral(){
        if(sex == false){
            return "female";
        }
        return "male";
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
