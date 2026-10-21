import java.util.Arrays;

public class ObjectCloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human abhay = new Human(34, "Abhay Kushwaha");


        Human twin = (Human)abhay.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(abhay.arr));
    }
}
