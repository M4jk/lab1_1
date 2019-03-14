package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class Product {
    private String id;
    private String name;
    private Date snapshotDate;
    private String type;
    private BigDecimal price;

    public Product(String id, String name, Date snapshotDate, String type, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.snapshotDate = snapshotDate;
        this.type = type;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getSnapshotDate() {
        return snapshotDate;
    }

    public String getType() {
        return type;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id)
               && Objects.equals(name, product.name)
               && Objects.equals(snapshotDate, product.snapshotDate)
               && Objects.equals(type, product.type)
               && Objects.equals(price, product.price);
    }

    @Override public int hashCode() {
        return Objects.hash(id, name, snapshotDate, type, price);
    }
}
