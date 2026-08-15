//common string method
public class string5 {
    public static void main(String[] args) {
        String str="this,is,the,a,string";
        System.out.println(str.substring(4,12));
        System.out.println(str.contains("is"));
        System.out.println(str.startsWith("fog"));
        System.out.println(str.endsWith("ing"));

        String[] words=str.split(",");
        for (String input:words){
            System.out.println(input);
        }
        str=str.replace('i','t');
        System.out.println(str);
    }}
