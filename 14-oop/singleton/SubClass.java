import java.util.ArrayList;
import java.util.Collections;

public class SubClass extends AccessModifierBase {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        AccessModifierBase obj = new AccessModifierBase(45, "Abhay Kushwaha");

    }
}

class SubSubclass extends SubClass {

    public SubSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(45, "Abhay Kushwaha");
        int n = obj.num;
    }
}

class SubClass2 extends AccessModifierBase {

    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass2 obj = new SubClass2(45, "Abhay Kushwaha");

    }
}