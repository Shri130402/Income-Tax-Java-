import java.util.Scanner;

public class IncomeTax {
    static void calculateTax(double ti) { // ti = total income
        double tax = 0, cess = 0;
        if (ti > 300000 && ti <= 500000)
            tax = (ti - 300000) * 0.1; // slab 1
        else if (ti > 500000 && ti <= 1000000)
            tax = 200000 + (ti - 500000) * 0.2; // slab 1 + slab 2
        else if (ti > 1000000)
            tax = 1200000 + (ti - 1000000) * 0.3; // slab 1 + slab 2 + slab 3
        cess = tax * 0.03;
        System.out.println("Total tax payable: " + tax);
        System.out.println("Total cess is: " + cess);
        System.out.println("Tax payable:" + (tax + cess));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class
        System.out.print("Enter the Total Income of the person: ");
        double total_income = sc.nextDouble(); // taking user input
        calculateTax(total_income); // calculating the tax
        sc.close();
    }
}