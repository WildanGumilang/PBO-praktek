public class Cash extends PaymentService {
    @Override
    public String getPaymentStatus() {
        return "Pembayaran Cash berhasil"; // Contoh status
    }
    
    @Override
    public String getPaymentMethod() {
        return "Cash";
    }
}
