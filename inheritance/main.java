package inheritance;

public class main {
    public static void main(String[] args) {
        car c=new car("BMW","M3",4,4,"Automatic");
        c.startengine();
        c.startAC();
        c.stopengine();

        motorcycle m=new motorcycle("Honda","hornet",2,"U","soft");
        m.startengine();
        m.whilee();
        m.stopengine();
    }
}
