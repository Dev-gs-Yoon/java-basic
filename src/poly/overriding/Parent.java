package poly.overriding;

public class Parent {
    /*
    다형성을 이루는 중요한 핵심 이론은 메서드 오버라이딩으로
    꼭 기억해야할 점은 어버라이딩 된 메서드가 항상 우선권을 가진다.
    */
    // 멤버 변수는 오바리이딩 되지 않는다.
    public String value = "parent";

    public void method() {
        System.out.println("Parent.method");
    }
}
