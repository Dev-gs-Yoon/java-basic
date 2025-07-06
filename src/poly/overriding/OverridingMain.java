package poly.overriding;
public class OverridingMain {
    public static void main(String[] args) {
        // 자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child => Child");
        System.out.println("value = " + child.value);
        child.method();

        System.out.println();

        // 부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        System.out.println();

        // 부모 변수가 자식 인스턴스 참조 ( 다형적 참조 )
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + poly.value); // 부모가 출력됨 // 멤버 변수는 오버라이딩 안됨
        poly.method(); // 자식 메서드 출력 됨 // 메서드는 오버라이딩 됨

        // 다형성 : 한 객체가 여러 탑의 객체로 취급 될 수 있는 능력
        // 다형적 참조 : 하나의 변수 타입으로 다양한 자식 인스턴스를 참조할 수 있는 기능
        // 메서드 오버라이딩 : 기존 기능을 하위 타입에서 새로운 기능으로 재정의
    }
}
