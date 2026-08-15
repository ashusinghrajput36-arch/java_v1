//to check if a string is palindrome
public class string_q4 {
    static String reversestring(String str){
        String reverse="";
        int n=str.length();
        for (int i=n-1;i>=0;i--){
            char ch=str.charAt(i);
            reverse=reverse+ch;

        }return reverse;
    }

    static boolean ispalindrome(String str){
        String original= str;
        String reverse= reversestring(original);
        for (int i=0;i<=original.length()-1;i++){
            char ch1=original.charAt(i);
            char ch2=reverse.charAt(i);
            if (ch1!=ch2){
                return false;
            }//loop ke bahar tabhi ayega jb sab character match hoga
        }return true;
    }

    public static void main(String[] args) {
        String str="NITIN";
        System.out.println(ispalindrome(str));
    }

    }

