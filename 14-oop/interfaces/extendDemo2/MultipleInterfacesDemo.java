public class MultipleInterfacesDemo implements StaticGreetingInterface, GreetingInterface {
    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        MultipleInterfacesDemo obj = new MultipleInterfacesDemo();
        StaticGreetingInterface.greeting();
    }
}
