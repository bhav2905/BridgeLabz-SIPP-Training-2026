package CouponValidator;

public class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {

        if (!CouponValidator.isLengthValid(code)) {
            return false;
        }

        return code.startsWith("SAVE");
    }
}