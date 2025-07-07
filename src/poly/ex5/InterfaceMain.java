package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        // 인터페이스 생성 불가
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        // 인터페이스 사용 목적 : 모든 메서드가 추상 메서드인 경우 public abstract가 생략 되어있어서 좀 더 편한 Interface를 만드는게 더 좋다.
        //  1 : 메서드를 반드시 구현하라는 제약(규약)을 주는 것이다.
        //    - 추상 클래스의 경우 추후 메서드를 추가했을 때 추가된 기능을 자식 클래스에서 구현하지 않을 수도 있고 또 추상 클래스가 아니게 된다
        //      하지만 인터페이스의 경우 모든 메서드가 추상 메서드이므로 위와 같은 문제를 원천 차단한다.
        //  2. 다중 구현 : 클래스 상송은 트리 구조 처럼 자식은 하나의 부모만 둘 수 있다. 반면, 인터페이스는 부모를 여러명 두는 다중 구현( 다중 상속 )이 가능하다.
        animalSound(dog);
        animalSound(cat);
        animalSound(cow);
    }
    private static void animalSound(InterfaceAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println();
    }
}
