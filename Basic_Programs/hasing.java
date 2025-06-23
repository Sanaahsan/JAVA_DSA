import java.util.*;

public class hasing {
    public static void main(String[] args) {
        
        
        // country(key),population(value)
        HashMap<String,Integer> countryInfo = new HashMap<>();

        // insertion

            countryInfo.put("India", 20);
            countryInfo.put("US", 30);
            countryInfo.put("China", 50);

            // System.out.println(countryInfo.getOrDefault("India",100));
            // System.out.println(countryInfo.getOrDefault("Canada",100));
           


            for(int i=1;i<=5;i++){
                 countryInfo.put("India",countryInfo.getOrDefault("India", 0)+i );
                 System.out.println(countryInfo.get("India"));
            }
            // map.getOrDefault("key",defaultvalue)
            // this will check if the key is present in the map or not. If the key is present, it will return its value. If the key is not present, it will return the default value.

            System.out.println(countryInfo);

            // traversal for hashmap

        for(Map.Entry<String,Integer>e: countryInfo.entrySet()){
            System.out.println(e.getKey());
            System .out.println(e.getValue());
        }

        // remove a key value pair

        countryInfo.remove("China");
        System.out.println(countryInfo);
        










                }

    
    
}
