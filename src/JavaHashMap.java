import java.util.HashMap;

public class JavaHashMap {

    public static void main(String[] args) {
        // HashMap implements the Map interface (need import)
        // HashMap is similar to ArrayList, but with key-value pairs
        // stores objects, need to use Wrapper Class
        // ex: (name,email),(username,userID),(country,capital)

        HashMap<String,String> countries = new HashMap<String,String>();
//        add a key value pair

        countries.put("India","New Delhi");
        countries.put("Japan","Tokyo");
        countries.put("Russia","Moscow");
        countries.put("Uganda","Kampala");
        countries.put("USA","Washington DC");

//        countries.remove("USA");
//        System.out.println(countries.get("Russia"));
//        countries.clear();
//        System.out.println(countries.size());
//        countries.replace("USA","Detroit");
//        System.out.println(countries.containsKey("England"));
//        System.out.println(countries.containsValue("Tokyo"));
//        System.out.println(countries);
        for (String i :
                countries.keySet()) {
            System.out.print(i+"\t"+" : ");
            System.out.println(countries.get(i));
        }

    }
}

