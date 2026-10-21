public class NestedInterfaceContainer {
    
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

class OddNumberChecker implements NestedInterfaceContainer.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}