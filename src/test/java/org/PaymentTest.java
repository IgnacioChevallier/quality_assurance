package org;

import org.junit.jupiter.api.Test;
import org.paymentMethods.CreditCard;
import org.paymentMethods.MercadoPago;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentTest {
    @Test
    public void mercado_pago_payment_is_accepted_001() {
        PaymentManager paymentManager = new PaymentManager();
        MercadoPago mercadoPago = new MercadoPago(20000.0, new User());
        assertTrue(paymentManager.paymentMethodIsAvailable(mercadoPago));
    }

    @Test
    public void card_payment_is_accepted_002() {
        PaymentManager paymentManager = new PaymentManager();
        CreditCard card = new CreditCard();
        assertTrue(paymentManager.paymentMethodIsAvailable(card));
    }

    @Test
    public void valid_payment_should_decrease_balance_006() {}

    @Test
    public void invalid_payment_should_not_decrease_balance_007() {}

    @Test
    public void user_should_be_able_to_deposit_money_008() {}

    @Test
    public void hacker_should_not_be_able_to_withdraw_money_009() {}

    @Test
    public void insufficient_funds_failure_003() {
        User user = new User();
        MercadoPago mercadoPago = new MercadoPago(200.0, user);
        assertThrows(IllegalArgumentException.class, () -> mercadoPago.pay(2000, user));
    }

    @Test
    public void invalid_user_credentials_failure_004() {
        User owner = new User();
        MercadoPago mercadoPago = new MercadoPago(20000.0, owner);
        User hacker = new User();
        assertThrows(IllegalArgumentException.class, () -> mercadoPago.pay(2000, hacker));
    }

    @Test
    public void invalid_user_should_not_be_able_to_see_balance_005() {}
}
