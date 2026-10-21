public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Abhay";
        {

                a = 100; 
            System.out.println(a);
                int c = 99;
                name = "Rahul";
            System.out.println(name);
                
        }
        int c = 900;
        System.out.println(a);
        System.out.println(name);


        
        for (int i = 0; i < 4; i++) {

            int num = 90;
            a = 10000;
        }
        System.out.println();
    }

    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
