package poly.ex.pay2;

import java.util.Scanner;

public class PayMain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.print("결제 수단을 입력하세요:");
            String option = sc.nextLine();

            if (option.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.print("결제 금액을 입력하세요:");
            int amount = sc.nextInt();
            sc.nextLine();

            payService.processPay(option, amount);

//            switch (option) {
//                case "kakao" -> option = "kakao";
//                case "naver" -> option = "naver";
//                case "bad" -> System.out.println("지원하지 않는 결제 수단입니다.");
//                default -> System.out.println("다른 결제 수단을 입력해주세요.");
//            }
//
//            if (!option.equals("bad")) {
//                System.out.print("결제 금액을 입력하세요:");
//                int amount = sc.nextInt();
//                sc.nextLine();
//                payService.processPay(option, amount);
//            }
        }
    }
}
