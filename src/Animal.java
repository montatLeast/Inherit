public class Animal {
    int age;
    float weight;

    public Animal(int age, float weight) {
        this.age = age;
        this.weight = weight;
    }

    public void run(){
        System.out.println("Animal is running!");
    }
    public void eat(){
        System.out.println("Animal is eating!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
