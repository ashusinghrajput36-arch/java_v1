public class app2 {
    public static void main(String[] args) {
        Student2 A=new Student2(1,12,"samar",3,"naina");

        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.nos);
        System.out.println(A.id);
       // System.out.println(A.gf); //this is because we've used "private" keyword

        A.sleep();
        A.study();
        //A.gfchatting();
                //error occurs because it is a private
    }

}
