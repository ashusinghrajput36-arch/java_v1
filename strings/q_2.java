package strings;
//remove all occurance of a substring
public class q_2 {
    public String removealloccurance(String s,String part){
        while (s.contains(part)){
            int index=s.indexOf(part);
            s=s.substring(0,index)+s.substring(index+part.length());
        }
        return s;
    }
}
