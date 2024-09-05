import java.util.Scanner;

public class P3Soal5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        
        String plates = line.replace(" ", "");
        
        long plate = Long.parseLong(plates);

        long result = plate - 999999;

        if (result % 5 == 0) {
            System.out.println("Jalan");
        } else {
            System.out.println("Berhenti");
        }

        scanner.close();
    }
}
