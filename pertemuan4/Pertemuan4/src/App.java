import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class App {
    public static void main(String[] args) {
        Product barang1 = new Product("Teh Manis", 1470000, 10);
        Sales sales1 = new Sales(barang1);

        sales1.sellProduct(5);
        sales1.restockProduct(5);
        sales1.updateProductPrice(200000000);

    }
}
