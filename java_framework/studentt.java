package java_framework;

public class studentt {
    public int rollno;
    public String name;

    public studentt(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "studentt{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
