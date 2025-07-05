package extends1.super1;

public class Child extends Parent {

    public String value = "Child";

    @Override
    public void hello(){
        System.out.println("Child, Hello!");
    }

    public void call() {
        // this 자기 자신
        System.out.println("this value = " + this.value); // this 생략 가능
        // super 부모
        System.out.println("super value = " + super.value);

        this.hello();
        super.hello();
    }
}
