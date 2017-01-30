package maksim_ya.models;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "[order]")
public class Order extends  Model {
    private  static  final long serialVersionUID = 84856383920094L;
    @ManyToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;
    @ManyToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "count")
    private  int count;

    @Column (name = "status")
    private Boolean ststus;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Boolean getStstus() {
        return ststus;
    }

    public void setStstus(Boolean ststus) {
        this.ststus = ststus;
    }

    public Order() {
        super();
    }

    public Order(Long id) {
        super(id);
    }
}
