import java.util.HashMap;
import java.util.HashSet;

class HashMapUsageDemo {
  public static void main(String[] args) {
    HashMapFinal<String, String> map = new HashMapFinal<>();

    map.put("Mango", "King of fruits");
    map.put("Apple", "A sweet red fruit");
    map.put("Litchi", "Abhay's fav fruit");

    System.out.println(map);
  }

  public static void hashDemo() {
    HashMap<String, Integer> map = new HashMap<>();

    map.put("Abhay", 89);
    map.put("Karan", 99);
    map.put("Rahul", 94);

    System.out.println(map.containsKey("Karan"));

    HashSet<Integer> set = new HashSet<>();
    set.add(56);
    set.add(9);
    set.add(12);
    set.add(43);
    set.add(56);
    set.add(2);

    System.out.println(set);
  }
}
