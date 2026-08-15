package java_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        Map<String,String> mapping=new HashMap<>();

        //insertionn

        //put()
        mapping.put("in","india");
        mapping.put("in","india2"); //in pe update ho jayega

        mapping.put("en" , "england");
        mapping.put("us","united state");
        System.out.println(mapping);

        //putting new value
        //putAll()
        Map<String,String> table=new HashMap<>();
        table.put("br","brazil");
        System.out.println("before: "+table);
        table.putAll(mapping);
        System.out.println("after: "+table);

        //deleletion
        table.remove("us");
        System.out.println(table);

        //size
        System.out.println(table.size());
        //similarlly clear used to remove all elements in it

        //putifabsent
        table.putIfAbsent("is3","india3");
        System.out.println(table);

        //get()
        System.out.println(table.get("br"));

        //getdefault()
        System.out.println(table.getOrDefault("usa","none"));

        //containskey()
        System.out.println(table.containsKey("in"));

        //containsvalue()
        System.out.println(table.containsValue("brazil"));

        //replace
        System.out.println(table);

        table.replace("is3","india3","indonesia");
        System.out.println(table);

        //keyset()
        Set<String> keySet=table.keySet();
        System.out.println(keySet);

        //value()
        System.out.println(table.values());

        //getalltheentries()
        Set<Map.Entry<String,String>> entrySet= table.entrySet();
        System.out.println("the entries are: "+entrySet);





        //iterating over map
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
        for (Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println("key: "+entry.getKey()+", values: "+entry.getValue());
        }


    }
}
