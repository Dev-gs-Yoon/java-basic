package poly.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal[] animalArr =  {new Dog(), new Cat(), new Cow()};

        // 변하지 않는 부분
//        for (int i = 0; i < animalArr.length; i++) {
//            Animal animal = animalArr[i];
//            animalSound(animal);
//        }
        for (Animal animal : animalArr) {
            animalSound(animal);
        }
    }
    private static void animalSound(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println();
    }
}
