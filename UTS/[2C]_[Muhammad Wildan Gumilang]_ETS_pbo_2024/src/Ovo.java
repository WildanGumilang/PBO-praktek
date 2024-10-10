public class Ovo extends PaymentService {
    @Override
    public String getPaymentStatus() {
        return "Pembayaran OVO berhasil"; // Contoh status
    }
    
    @Override
    public String getPaymentMethod() {
        return "OVO";
    }
}