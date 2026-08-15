package java_framework;

public class student_3 implements Comparable <student_3>{
    public int age;
    public String name;
    public int weight;

    @Override
    public String toString() {
        return "student_3{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public student_3(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(student_3 that) {

        if (this.age==that.age){
            return this.name.compareTo(that.name);
        }
        return this.age- that.age;
    }
}
