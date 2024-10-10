import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.FileReader;
import java.io.IOException;
import javax.xml.crypto.Data;

public class App {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Delivery[] deliveries = gson.fromJson(new FileReader("lib/delivery.json"), Delivery[].class);

        // Menampilkan header tabel
        System.out.println("Product Name      | Quantity | Weight | Destination | Service Package   | Service Value | Total      | Payment Method | Payment Status");
        System.out.println("------------------------------------------------------------------------------------------------------------");

        // Contoh penggunaan kelas pembayaran
        PaymentService paymentService = new Cash(); // Ganti dengan OVO atau QRIS sesuai kebutuhan

        for (Delivery delivery : deliveries) {
            if (delivery != null) {
                double total = delivery.getQuantity() * delivery.getPriceItem() + delivery.getServicePackage().getValue();
                System.out.println(
                        delivery.getProductName() + "     | " +
                        delivery.getQuantity() + "       | " +
                        delivery.getWeight() + "      | " +
                        delivery.getCity().getDestination() + "    | " +
                        delivery.getServicePackage().getService() + "   | " +
                        delivery.getServicePackage().getValue() + "          | " +
                        total + "     | " +
                        paymentService.getPaymentMethod() + "    | " +
                        paymentService.getPaymentStatus()
                );
            }
        }
    }
}
