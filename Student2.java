public class Student2 {
    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;

    //parameterized constructor
    public Student2(int id,int age,String name,int nos, String gf){
        System.out.println("Student this is a parameterized constructor");
        this.id=id;
        this.age=age;
        this.name=name;
        this.nos=nos;
        this.gf=gf;
    }

    public void study()
    {
        System.out.println(name+" studying the no. of subjects"+ nos);
    }
    public void sleep(){
        System.out.println(name+" sleeping");
    }
    private void gfchatting(){
        System.out.println(name+"gfchatting");
    }
}
