//common string method
public class string4 {
    public static void main(String[] args) {
        String str="Ashu ";
        String name="ashu ";
        System.out.println(str.length());
        System.out.println(name.charAt(2));
        System.out.println(str.equals(name));
        System.out.println(str.equalsIgnoreCase(name));
        System.out.println(str.isEmpty());
        System.out.println(name.isBlank());
        System.out.println(name.trim());
        System.out.println(name.toUpperCase());
        System.out.println(str.toLowerCase());

        char[] crr=name.toCharArray();
        //print the char array
        for(char ch:crr){
            System.out.println("value of char :"+ch);
        }
    }
}
