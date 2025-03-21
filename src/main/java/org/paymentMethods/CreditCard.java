package org.paymentMethods;

import org.User;

import java.util.Objects;

public class CreditCard implements PaymentMethod {
    private final String name = "Credit Card";
    private final User user;
    private final double balance;

    public CreditCard(Double balance, User user) {
        this.balance = balance;
        this.user = user;
    }

    public CreditCard() {
        this.balance = 0.0;
        this.user = null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public void pay(double amount, User user) {
        if (amount > balance) { throw new IllegalArgumentException("Insufficient balance");}
        if (user != this.user) { throw new IllegalArgumentException("User is not authorized");}
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CreditCard;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
