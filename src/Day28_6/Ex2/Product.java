package Day28_6.Ex2;

public class Product {
    private int productId;
    private String productName;
    private double price;
    static final String storeName = "ABC Store";

    public Product( int productId, double price, String productName) {
        this.price = price;
        this.productName = productName;
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", storeName=" + storeName +
                '}';
    }
}
