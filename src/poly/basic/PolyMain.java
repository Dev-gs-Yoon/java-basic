package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println();

        System.out.println("Child -> Child");
        Child child = new Child();
        child.childMethod();

        System.out.println();

        System.out.println("Parent => Child");
        Parent poly = new Child();
        poly.parentMethod();

//        poly.childMethod();
        // 부모에서 자식 메서드 (기능) 사용 불가
    }
}
