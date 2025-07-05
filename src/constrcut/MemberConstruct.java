package constrcut;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        // 첫줄에 this 체이닝을 사용하지 않으면 컴파일 오류 발생
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("name: " + name + ", age: " + age + ", grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
