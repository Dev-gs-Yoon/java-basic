package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.commonMethod();

        InterfaceB b = new Child();
        b.methodB();
        b.commonMethod();
    }
}
