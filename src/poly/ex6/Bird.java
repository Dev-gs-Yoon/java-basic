package poly.ex6;

public class Bird extends AbstractAnimal implements Fly {
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void move() {
        System.out.println("새가 움직입니다.");
    }

    @Override
    public void fly() {
        System.out.println("새가 날아다녀요");
    }
}
