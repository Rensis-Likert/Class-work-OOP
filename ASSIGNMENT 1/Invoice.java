import java.util.Scanner;

class Invoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- 1. CAPTURE BILL TO / SHIP TO INFORMATION ---
        System.out.println("--- ENTER INVOICE DETAILS ---");

        System.out.print("Enter Customer Name: ");
        String custName = input.nextLine();

        System.out.print("Enter Address Line 1: ");
        String custAddr1 = input.nextLine();

        System.out.print("Enter Address Line 2: ");
        String custAddr2 = input.nextLine();

        System.out.print("Enter Address line 3: ");
        String custAddr3 = input.nextLine();

        System.out.print("Enter Contact Number: ");
        String custPhone = input.nextLine();

        System.out.print("Enter Email: ");
        String custEmail = input.nextLine();

        // --- 2. CAPTURE PRODUCT INFORMATION (Item 1) ---
        System.out.println("\n--- ENTER PRODUCT INFORMATION FOR ITEM 1 ---");

        int sno1 = 1;
        System.out.print("Product Code: ");
        int code1 = input.nextInt();
        input.nextLine();

        System.out.print("Product Name: ");
        String name1 = input.nextLine();

        System.out.print("HSN Code: ");
        String hsn1 = input.next();

        System.out.print("Quantity: ");
        int qty1 = input.nextInt();

        System.out.print("Units (e.g., nos): ");
        String unit1 = input.next();

        System.out.print("Rate: ");
        double rate1 = input.nextDouble();

        System.out.print("Tax Percentage: ");
        double taxPer1 = input.nextDouble();

        // Calculate Amount for Item 1
        double basic1 = qty1 * rate1;
        double taxAmt1 = basic1 * (taxPer1 / 100);
        double amount1 = basic1 + taxAmt1;

        // --- 3. DEFINE REMAINING ITEMS (Variables for Rows 2-7) ---
        // Calculated strictly using the logic: (Qty * Rate) + Tax

        // Item 2
        System.out.println("\n--- ENTER PRODUCT INFORMATION FOR ITEM 2 ---");
        int sno2 = 2;
        System.out.print("Product Code: ");
        int code2 = input.nextInt();
        input.nextLine();

        System.out.print("Product Name: ");
        String name2 = input.nextLine();

        System.out.print("HSN Code: ");
        String hsn2 = input.next();

        System.out.print("Quantity: ");
        int qty2 = input.nextInt();

        System.out.print("Units (e.g., nos): ");
        String unit2 = input.next();

        System.out.print("Rate: ");
        double rate2 = input.nextDouble();

        System.out.print("Tax Percentage: ");
        double taxPer2 = input.nextDouble();

        // Calculate Amount for Item 2
        double basic2 = qty2 * rate2;
        double taxAmt2 = basic2 * (taxPer2 / 100);
        double amount2 = basic2 + taxAmt2;

        // Item 3
        System.out.println("\n--- ENTER PRODUCT INFORMATION FOR ITEM 3 ---");
        int sno3 = 3;
        System.out.print("Product Code: ");
        int code3 = input.nextInt();
        input.nextLine();

        System.out.print("Product Name: ");
        String name3 = input.nextLine();

        System.out.print("HSN Code: ");
        String hsn3 = input.next();

        System.out.print("Quantity: ");
        int qty3 = input.nextInt();

        System.out.print("Units (e.g., nos): ");
        String unit3 = input.next();

        System.out.print("Rate: ");
        double rate3 = input.nextDouble();

        System.out.print("Tax Percentage: ");
        double taxPer3 = input.nextDouble();

        // Calculate Amount for Item 3
        double basic3 = qty3 * rate3;
        double taxAmt3 = basic1 * (taxPer3 / 100);
        double amount3 = basic3 + taxAmt3;

        // Item 4
        System.out.println("\n--- ENTER PRODUCT INFORMATION FOR ITEM 3 ---");
        int sno4 = 4;
        System.out.print("Product Code: ");
        int code4 = input.nextInt();
        input.nextLine();

        System.out.print("Product Name: ");
        String name4 = input.nextLine();

        System.out.print("HSN Code: ");
        String hsn4 = input.next();

        System.out.print("Quantity: ");
        int qty4 = input.nextInt();

        System.out.print("Units (e.g., nos): ");
        String unit4 = input.next();

        System.out.print("Rate: ");
        double rate4 = input.nextDouble();

        System.out.print("Tax Percentage: ");
        double taxPer4 = input.nextDouble();

        // Calculate Amount for Item 4
        double basic4 = qty4 * rate4;
        double taxAmt4 = basic4 * (taxPer4 / 100);
        double amount4 = basic4 + taxAmt4;

        // Item 5
        System.out.println("\n--- ENTER PRODUCT INFORMATION FOR ITEM 5 ---");
        int sno5 = 5;
        System.out.print("Product Code: ");
        int code5 = input.nextInt();
        input.nextLine();

        System.out.print("Product Name: ");
        String name5 = input.nextLine();

        System.out.print("HSN Code: ");
        String hsn5 = input.next();

        System.out.print("Quantity: ");
        int qty5 = input.nextInt();

        System.out.print("Units (e.g., nos): ");
        String unit5 = input.next();

        System.out.print("Rate: ");
        double rate5 = input.nextDouble();

        System.out.print("Tax Percentage: ");
        double taxPer5 = input.nextDouble();

        // Calculate Amount for Item 5
        double basic5 = qty5  * rate5;
        double taxAmt5 = basic5 * (taxPer5 / 100);
        double amount5 = basic5 + taxAmt5;

        // Item 6
        System.out.println("\n--- ENTER PRODUCT INFORMATION FOR ITEM 6 ---");
        int sno6 = 6;
        System.out.print("Product Code: ");
        int code6 = input.nextInt();
        input.nextLine();

        System.out.print("Product Name: ");
        String name6 = input.nextLine();

        System.out.print("HSN Code: ");
        String hsn6 = input.next();

        System.out.print("Quantity: ");
        int qty6 = input.nextInt();

        System.out.print("Units (e.g., nos): ");
        String unit6 = input.next();

        System.out.print("Rate: ");
        double rate6 = input.nextDouble();

        System.out.print("Tax Percentage: ");
        double taxPer6 = input.nextDouble();

        // Calculate Amount for Item 6
        double basic6 = qty6 * rate6;
        double taxAmt6 = basic6 * (taxPer6 / 100);
        double amount6 = basic6 + taxAmt6;

        // Item 7
        System.out.println("\n--- ENTER PRODUCT INFORMATION FOR ITEM 7 ---");
        int sno7 = 7;
        System.out.print("Product Code: ");
        int code7 = input.nextInt();
        input.nextLine();

        System.out.print("Product Name: ");
        String name7 = input.nextLine();

        System.out.print("HSN Code: ");
        String hsn7 = input.next();

        System.out.print("Quantity: ");
        int qty7 = input.nextInt();

        System.out.print("Units (e.g., nos): ");
        String unit7 = input.next();

        System.out.print("Rate: ");
        double rate7 = input.nextDouble();

        System.out.print("Tax Percentage: ");
        double taxPer7 = input.nextDouble();

        // Calculate Amount for Item 7
        double basic7 = qty7 * rate7;
        double taxAmt7 = basic7 * (taxPer7 / 100);
        double amount7 = basic7 + taxAmt7;

        // --- 4. TOTAL CALCULATIONS ---
        double subTotal = amount1 + amount2 + amount3 + amount4 + amount5 + amount6 + amount7;

        // Discount is 0.6368%
        double discountPercent = 0.6368;
        double discountValue = subTotal * (discountPercent / 100);

        double grandTotal = subTotal - discountValue;

        // --- 5. OUTPUT GENERATION ---
        System.out.println("\n\n");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("                                     THENDRAL SUPERMARKET INVOICE                                            ");
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        // Bill To / Ship To Columns
        System.out.println("Bill To:\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tShip To:");
        System.out.println(custName + "\t\t\t\t\t\t\t\t\t\t\t  " + custName);
        System.out.println(custAddr1 + "\t\t\t\t\t\t\t\t\t\t\t\t  " + custAddr1);
        System.out.println(custAddr2 + "\t\t\t\t\t\t\t\t\t\t" + custAddr2);
        System.out.println(custAddr3 + "\t\t\t\t\t\t\t\t\t\t\t\t\t" + custAddr3);
        System.out.println("Contact: " + custPhone + "\t\t\t\t\t\t\t\t\t\t\t\tContact: " + custPhone);
        System.out.println("Email: " + custEmail + "\t\t\t\t\t\t\t\t\tEmail: " + custEmail);

        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("Payment Date: 7 days from date of delivery          Payment Terms: 100% against invoice");
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        // Table Header
        System.out.println("S.No\tCode\tProduct Name\t\tHSN\t\t\tQty\t\tUnits\tRate\tTax\tAmount");
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        // Printing Rows (Using (int) casting to remove decimals for cleaner look matching the image)
        System.out.println(sno1 + "\t\t" + code1 + "\t\t" + name1 + "\t\t" + hsn1 + "\t" + qty1 + "\t\t" + unit1 + "\t\t" + rate1 + "\t" + (int)taxPer1 + "%\t" + (int)amount1 + ".00");
        System.out.println(sno2 + "\t\t" + code2 + "\t\t" + name2 + "\t\t\t" + hsn2 + "\t" + qty2 + "\t\t" + unit2 + "\t\t" + rate2 + "\t" + (int)taxPer2 + "%\t" + (int)amount2 + ".00");
        System.out.println(sno3 + "\t\t" + code3 + "\t\t" + name3 + "\t" + hsn3 + "\t" + qty3 + "\t\t" + unit3 + "\t\t" + rate3 + "\t" + (int)taxPer3 + "%\t" + (int)amount3 + ".00");
        System.out.println(sno4 + "\t\t" + code4 + "\t\t" + name4 + "\t\t" + hsn4 + "\t" + qty4 + "\t\t" + unit4 + "\t\t" + rate4 + "\t" + (int)taxPer4 + "%\t" + (int)amount4 + ".00");
        System.out.println(sno5 + "\t\t" + code5 + "\t\t" + name5 + "\t\t" + hsn5 + "\t" + qty5 + "\t\t" + unit5 + "\t\t" + rate5 + "\t" + (int)taxPer5 + "%\t" + (int)amount5 + ".00");
        System.out.println(sno6 + "\t\t" + code6 + "\t\t" + name6 + "\t\t" + hsn6 + "\t" + qty6 + "\t\t" + unit6 + "\t\t" + rate6 + "\t" + (int)taxPer6 + "%\t" + (int)amount6 + ".00");
        System.out.println(sno7 + "\t\t" + code7 + "\t\t" + name7 + "\t\t" + hsn7 + "\t" + qty7 + "\t\t" + unit7 + "\t\t" + rate7 + "\t" + (int)taxPer7 + "%\t" + (int)amount7 + ".00");

        System.out.println("-------------------------------------------------------------------------------------------------------------");

        // Totals Section
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tTotal\t\t" + (int)subTotal + ".00");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDiscounts\t" + (int)discountValue + ".00");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tGrand Total\t" + (int)grandTotal + ".00");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
    }
}