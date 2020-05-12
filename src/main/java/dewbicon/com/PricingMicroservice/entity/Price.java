package dewbicon.com.PricingMicroservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String currency;
    private BigDecimal price;

    public Price(Long Id, String currency, BigDecimal price) {
        this.id = Id;
        this.currency = currency;
        this.price = price;
    }

    public Price() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long vehicleId) {
        this.id = vehicleId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
