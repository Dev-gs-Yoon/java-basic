package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue = 1;
        protectedValue = 2; // 상속 관계 OR 같은 패지키
//        defaultValue // 다른 패키지에서 접근 불가 ( 같은 패키지만 가능 )
        // privateValue // 접근 불가

        publicMethod();
        protecedMethod(); // 상속 관계 OR 같은 패지키
//        defaultMethod(); // 다른 패키지에서 접근 불가
//        privateMethod();

        printParent();
    }
}
