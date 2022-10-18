import java.util.LinkedList;
import java.util.List;

public class ProductList {

    public List<Product> list = new LinkedList<>();

    public void addToList(String name, Integer price, Integer amount) {
        for (Product current : list) {
            if (current.getName().equals(name)) {
                throw new RuntimeException("Продукт уже есть в списке!");
            }
        }
        list.add(new Product(name, price, amount));
    }

    public void deleteFromList(String name) {
        for (Product current : list) {
            if (current.getName().equals(name)) {
                list.remove(current);
                System.out.printf("Продукт %s удален!\n", name);
                return;
            }
        }
        System.out.printf("Продукта %s нет в списке \n", name);
    }


    public void markBought(String name) {
        for (Product current : list) {
            if (current.getName().equals(name)) {
                current.setBought(true);
                System.out.printf("Продукт %s куплен!\n", name);
                return;
            }
        }
        System.out.printf("Продукта %s нет в списке \n", name);
    }

    public void printAll() {
        for (Product current : list) {
            System.out.printf("Продукт %s, по цене %d, количество %d - ", current.getName(), current.getPrice(), current.getAmount());
            System.out.println((current.isBought())? "куплен" : "нужно купить");
        }
        if (list.isEmpty()) {
            System.out.println("Список пуст!");
        }

    }


}
