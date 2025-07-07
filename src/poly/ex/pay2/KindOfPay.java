package poly.ex.pay2;

public abstract class KindOfPay implements Pay {
    public static Pay choicePay(String option) {
        if (option.equals("kakao")) {
            return new KaKaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new NullObjectPatternPay();
        }
    }
}
