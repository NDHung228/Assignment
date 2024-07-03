package Day28_6.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Cart() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public double totalPrice() {
        double sum =0;
        for (Product p : products) {
            sum+=p.getPrice();
        }
        return sum;
    }

    public void showAllProduct() {
        for (Product p : products) {
            System.out.println(p.toString());
        }
    }
}
