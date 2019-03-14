package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Objects;

public class Discount {

    private String discountCause;
    private Money amount;

    public Discount(String discountCause, Money amount) {
        this.discountCause = discountCause;
        this.amount = amount;
    }

    public String getDiscountCause() {
        return discountCause;
    }

    public Money getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Discount discount1 = (Discount) o;
        return Objects.equals(discountCause, discount1.discountCause) && Objects.equals(amount, discount1.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountCause, amount);
    }
}
