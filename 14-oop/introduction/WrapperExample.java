public class WrapperExample {
    public static void main(String[] args) {





        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a + " " + b);




        final FinalFieldExample abhay = new FinalFieldExample("Abhay Kushwaha");
        abhay.name = "other name";

        


        FinalFieldExample obj = new FinalFieldExample("Rnadvsjhv");

        System.out.println(obj);





    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}

class FinalFieldExample {
    final int num = 10;
    String name;

    public FinalFieldExample(String name) {

        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
