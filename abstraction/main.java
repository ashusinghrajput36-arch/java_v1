package abstraction;
abstract class Bird {
    abstract void fly();
    abstract void eat();

}
class sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("sparrow flying...");
    }

    @Override
    void eat() {
        System.out.println("sparrow eating...");
    }
}
public class main{

    public static void main(String[] args) {
        Bird b=new sparrow();
        b.eat();
        b.fly();


    }
}
