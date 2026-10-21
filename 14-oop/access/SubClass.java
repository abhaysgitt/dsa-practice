public class SubClass extends AccessModifierBase{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Abhay Kushwaha");
        int n = obj.num;

        System.out.println(obj instanceof Object);
    }
}
