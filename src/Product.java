import java.util.Objects;

public class Product {
    private String name;
    private Integer price;

    public Product(String name, Integer price) {
        if (name == null || price == null || name.isBlank() || price <= 0) {
            throw new RuntimeException("Заполните карточку товара полностью!");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
