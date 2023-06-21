package VetInfo;

public class Animal {
    private int age;
    private int weight;
    private boolean sex;
    private String name;
    private String race;

    public Animal (int age, int weight, boolean sex, String name, String race){
            setAge(age);
            setWeight(weight);
            setSex(sex);
            setName(name);
            setRace(race);
    }
    public void print(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("sex: " + getSexLiteral());
        System.out.println("race: " + race);
        System.out.println("weight: " + weight);
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
