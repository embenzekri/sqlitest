import com.sqli.cart.Product;

public class App {

    public static void main(String[] args) {
        Cart cart = new Cart();
        Product kazaar = new Product("Kazaar", 100, 5);
        cart.addProduct(kazaar);
        Product ristretto = new Product("Ristretto", 50, 6);
        cart.addProduct(ristretto);

        System.out.println(cart.displaySummary());
    }

}
