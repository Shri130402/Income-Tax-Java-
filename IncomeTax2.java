public class IncomeTax2 {
    static double calculateTax(double ti) { // ti means total income
        double total_tax = 0;
        double total_cess = 0;
        double tax1 = 0, tax2 = 0, tax3 = 0;
        if (ti > 300000) { // slab 1
            double amt = 0;
            if ((ti - 300000) > 200000) // if ti > slab 1
                amt = 200000;
            else
                amt = ti - 300000;
            tax1 = (0.1 * amt); // total tax in slab 1
            total_tax += tax1;
            System.out.println("Tax Payable for 300,000 to 500,000: " + tax1);
        }
        if (ti > 500000) { // slab 2
            double amt = 0;
            if ((ti - 500000) > 500000) // if ti > slab 2
                amt = 500000;
            else
                amt = ti - 500000;
            tax2 = 0.2 * amt; // total tax in slab 2
            total_tax += tax2;
            System.out.println("Tax Payable for 500,000 to 1,000,000: " + tax2);
        }
        if (ti > 1000000) { // slab 3
            tax3 = 0.3 * (ti - 1000000); // total tax in slab 3
            total_tax += tax3;
            System.out.println("Tax Payable for 1,000,000 & above: " + tax3);
        }
        total_cess = 0.03 * total_tax; // all slabs have same 3% cess
        System.out.println("Total tax payable= " + tax1 + " + " + tax2 + " + " + tax3 + " = " + total_tax);
        System.out.println("Total cess = 3% of income tax = " + total_cess);
        return total_tax + total_cess; // return total tax + total cess
    }

    public static void main(String[] args) {
        System.out.println("total tax: " + calculateTax(2000000));
    }
}