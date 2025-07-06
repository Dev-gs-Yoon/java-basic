package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Duck duck = new Duck();
        Animal[] animalArr =  new Animal[4];
        animalArr = new Animal[]{dog, cat, cow, duck};

//        Animal[] animalArr1 = {dog, cat, caw, duck};

        // 변하지 않는 부분
        for (int i = 0; i < animalArr.length; i++) {
            System.out.println("동물 소리 테스트 시작");
            animalArr[i].sound();
            System.out.println("동물 소리 테스트 종료");
            System.out.println();
        }

//        for (Animal animal : animalArr) {
//            System.out.println("동물 소리 테스트 시작");
//            animal.sound();
//            System.out.println("동물 소리 테스트 종료");
//            System.out.println();
//        }
    }
}
