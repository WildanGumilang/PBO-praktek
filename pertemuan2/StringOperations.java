import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kata pertama : ");
        String kataPertama = scanner.nextLine();
        System.out.print("Masukkan Kata kedua : ");
        String kataKedua = scanner.nextLine();
        
        int panjangkata = kataPertama.length() + kataKedua.length();
        System.out.println(panjangkata);
        
        if (kataPertama.compareTo(kataKedua) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        String hasilKataPertama = kataPertama.substring(0, 1).toUpperCase() + kataPertama.substring(1);
        String hasilkataKedua = kataKedua.substring(0, 1).toUpperCase() + kataKedua.substring(1);
        System.out.println(hasilKataPertama + " " + hasilkataKedua);
        
        scanner.close();
    }
}
