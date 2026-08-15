//print each character of a string and find the length
public class string_q1 {
    static void printstring(String str){
        int n=str.length();
        for (int i=0;i<=n-1;i++){
            char ch=str.charAt(i);
            System.out.println(ch);
        }
    }
    static int lengthofstring(String str) {
        int count = 0;
        char[] arr=str.toCharArray();
        int len=arr.length;
        return len;
    }

    public static void main(String[] args) {
        String str="Ashu";
        printstring(str);
        System.out.println(lengthofstring(str));
    }
}
