package org.paymentMethods;

import org.User;

public interface PaymentMethod {
    String getName();
    Double getBalance();
    void pay(double amount, User user);
}
