import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many salespeople? ");
        int numSalespeople = scan.nextInt();
        SalesPerson[] salesPeople = new SalesPerson[numSalespeople];

        for (int i = 0; i < numSalespeople; i++) {
            System.out.print("Enter first name: ");
            String firstName = scan.next();

            System.out.print("Enter last name: ");
            String lastName = scan.next();

            System.out.print("Enter total sales: ");
            int totalSales = scan.nextInt();

            salesPeople[i] = new SalesPerson(firstName, lastName, totalSales);
        }

        Sorting.insertionSort(salesPeople);

        System.out.println("\nSalespeople sorted by sales (descending):");
        for (SalesPerson person : salesPeople) {
            System.out.println(person);
        }

        scan.close();
    }
}
