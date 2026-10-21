public class StaticMembersDemo {
    public static void main(String[] args) {








        StaticMembersDemo funn = new StaticMembersDemo();
        funn.fun2();

    }

    
    static void fun() {

        

        
        

        
        StaticMembersDemo obj = new StaticMembersDemo();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    
    void greeting() {

        System.out.println("Hello world");
    }
}
