package org;

import org.paymentMethods.CreditCard;
import org.paymentMethods.MercadoPago;
import org.paymentMethods.PaymentMethod;

import java.util.List;

public class PaymentManager {
    private final List<PaymentMethod> paymentMethods = List.of(new MercadoPago(), new CreditCard());

    public boolean paymentMethodIsAvailable(PaymentMethod method) {
        for (PaymentMethod paymentMethod : paymentMethods) {
            if (paymentMethod.equals(method)) {
                return true;
            }
        }
        return false;
    }
}
