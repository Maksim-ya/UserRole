package maksim_ya.models;

import javax.persistence.*;
import java.math.BigDecimal;



@Entity
@Table(name = "product")
public class Product extends Model {
    private static final long serialVersionUID = 7456846556473924L;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "parent_product_id", referencedColumnName = "id")
    private ProductCategory productCategory;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public Product() {
        super();
    }

    public Product(Long id) {
        super(id);
    }

    @Override
    public String toString() {
        return super.getId() +
                " - '" + title +
                " - " + description  +
                '}';
    }
}
