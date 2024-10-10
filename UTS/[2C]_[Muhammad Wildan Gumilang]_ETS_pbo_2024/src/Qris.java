public class Qris extends PaymentService {
    @Override
    public String getPaymentStatus() {
        return "Pembayaran QRIS berhasil"; // Contoh status
    }
    
    @Override
    public String getPaymentMethod() {
        return "QRIS";
    }
}
