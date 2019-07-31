import com.sqli.cart.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    public List<Product> products = new ArrayList();

    public void addProduct(Product kazaar) {
        products.add(kazaar);
    }

    /*
        Kazaar, totalPrice=500
        Ristreto, totalPrice=300
     */
    public String displaySummary() {
        StringBuilder stringBuilder= new StringBuilder();
        for (Product product : products) {
            stringBuilder.append(product.getName());
            stringBuilder.append(", totalPrice=");
            stringBuilder.append(product.computePrice());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
