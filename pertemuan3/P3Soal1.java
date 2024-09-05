import java.util.Scanner;

public class P3Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kalimat : ");
        String scan = scanner.nextLine();

        String input;
        String[] str  = scan.split("[ !,?._'@]");

        System.out.println(str.length);
        for (String s : str){
            System.out.println(s);
        }
        scanner.close();
    } 
}
