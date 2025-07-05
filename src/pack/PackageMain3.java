package pack;

import pack.a.*;

public class PackageMain3 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
        User2 user2 = new User2();
        // 이미 pack.a.User를 import 했기 때문에 다른 패키지의 같은 클래스 이름의 파일은 Full Name으로 작성해줘야 함
        pack.b.User user3 = new pack.b.User();
    }
}
