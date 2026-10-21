public class Comparison {
    public static void main(String[] args) {
        String a = "Abhay";
        String b = "Abhay";
        String c = a;

        


        String name1 = new String("Abhay");
        String name2 = new String("Abhay");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

    }
}
