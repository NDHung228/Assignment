package Day28_6.Ex2;

public class ShoppingApp {
    public static void main(String[] args) {
        int productId = 1;
        Product p1 = new Product(productId++,100,"product1");
        Product p2 = new Product(productId++,200,"product2");
        Product p3 = new Product(productId++,300,"product3");
        Product p4 = new Product(productId++,400,"product4");

        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);

        cart.addProduct(p3);
        cart.addProduct(p4);

        System.out.println("This is all product in cart");
        cart.showAllProduct();

        System.out.println("Total products in cart is: "+cart.totalPrice());

    }
}


