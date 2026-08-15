public class Student {
    //attributes

    public int id;
    public int age;
    public String name;
    public int nos;

    //constructor
    public Student(){
        System.out.println("Student default constructor");
    }
    //methods
    public void study(){
        System.out.println(name+" studying the no. of subjects"+ nos);
    }
    public void sleep(){
        System.out.println(name+" sleeping");
    }

}


