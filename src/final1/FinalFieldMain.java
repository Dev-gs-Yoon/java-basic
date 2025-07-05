package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);

        System.out.println("constructInit1 = " + constructInit1.value);
        System.out.println("constructInit2 = " + constructInit2.value);
        System.out.println();

        // final 필드 초기화
        // 아래처럼 필드 초기화를 하게 되면 인스턴스 생성할 때 마다 중복값이 힙 영역에 저정되어 메모리 누수와 성능 최적화에 좋지 않다
        // 이럴때 공용 변수를 사용하면 위와 같은 사항이 해결되기에 static을 활용해주면 해결된다.
        // static final int MY_VALUE = 10; 을 클래스에서 클래스 변수로 선언 후 사용하기!!
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println("fieldInit1 = " + fieldInit1.value);
        System.out.println("fieldInit2 = " + fieldInit2.value);
        System.out.println("fieldInit3 = " + fieldInit3.value);

        // 상수 (CONSTANT) 접근 // static final이 붙으면 상수라고 지칭함
        // 변하지 않고 항상 같은 값을 가지는 것
        // 단 하나만 존재하며 고정된 값을 가진 것을 static final 대문자 변수 사이는 _ 로 구분
        System.out.println();
        System.out.println("상수 접근");
        System.out.println(FieldInit.CONST_VALUE);

        System.out.println(Constant.HOURS_IN_DAY);
    }
}
