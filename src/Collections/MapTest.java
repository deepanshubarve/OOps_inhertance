package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> NewMap = new HashMap<>();
        NewMap.put("Deepu",23);
        NewMap.put("Rahul",22);
        NewMap.put("Anjali",92);
        NewMap.put("Dibbu",01);

        System.out.println(NewMap);

        //Accessing the element

        Integer value = NewMap.get("Rahul");
        System.out.println(value);

        //check key
        boolean Contains = NewMap.containsKey("Rahul");
        System.out.println(Contains);


        Integer sizeofmap = NewMap.size();
        System.out.println("size of map" + sizeofmap);
        Integer RemovedVaule = NewMap.remove("Dibbu");
        System.out.println(RemovedVaule);
        System.out.println(NewMap);
        System.out.println("size of map" + sizeofmap);
        System.out.println("whst si");

        //Ieterate

        for(Map.Entry<String ,Integer> entry : NewMap.entrySet()){

           String key = entry.getKey();
           Integer data = entry.getValue();

            System.out.println(key + "------" + data);
        }
    }
}
