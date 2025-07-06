package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("Parent1 호출");
        call(parent1);

        System.out.println();

        Parent parent2 = new Child();
        System.out.println("Parent2 호출");
        call(parent2);
    }
    private static void call(Parent parent) {
        parent.parentMethod();
        // 단점 : Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        } else {
            System.out.println("Child 인스턴스 아님");
        }
    }
}
