import java.util.Scanner;

public class P3Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan dua Operasi Bilangan : ");
        String scan = scanner.nextLine();
        int result = 0;

        String[] operasi = scan.split(" ");
        int A = Integer.parseInt(operasi[0]);
        if (A < 1){
            System.out.print("A Tidak dapat kurang dari 1");
            return;
        }
        String operator = operasi[1];
        int B = Integer.parseInt(operasi[2]);
        if (B > 1000){
            System.out.print("B Tidak dapat Lebih dari 1000");
            return;
        }
        
        switch (operator) {
            case "+":
                result = A + B;
                break;
            case "-":
                result = A - B;
                break;
            case "*":
                result = A * B;
                break;
            case "/":
                if (A % B == 0) {
                    result = A / B;
                } else {
                    System.out.println("hasil bagi tidak sama dengan 0");
                    scanner.close();
                    return;
                }
                break;
            case "%":
                result = A % B;
                break;
            default:
                System.out.println("Error: Unknown operator");
                scanner.close();
                return;
        }
        System.out.println(result);
        scanner.close();
    } 
}
