import java.util.Objects;

public class Product {
    private String name;
    private Integer price;
    private Integer amount;
    private boolean isBought;

    public Product(String name, Integer price, Integer amount) {
        if (name == null || price == null || amount == null
                || name.isBlank() || price <= 0 || amount <= 0) {
            throw new RuntimeException("Заполните карточку товара полностью!");
        }
        this.name = name;
        this.price = price;
        this.amount = amount;
        isBought = false;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getAmount() {
        return amount;
    }

    public boolean isBought() {
        return isBought;
    }

    public void setBought(boolean bought) {
        isBought = bought;
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
