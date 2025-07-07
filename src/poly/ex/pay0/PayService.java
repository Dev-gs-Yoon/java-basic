package poly.ex.pay0;

public class PayService implements KaKaoPay, NaverPay {

    @Override
    public void processPay(String payOption, int amount) {
        System.out.println(payOption + "페이 시스템을 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");

        if (payOption.equals("bad")) {
            System.out.println("결제 수단이 없습니다.");
        }
        System.out.println();
    }
}
