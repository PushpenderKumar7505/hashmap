import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<Integer,Integer>obj=new HashMap<>();
        obj.put(10,100);
        //obj.put(20,200);
        System.out.println(obj.get(10));
        System.out.println(obj.getOrDefault(20,9));
    }
}

