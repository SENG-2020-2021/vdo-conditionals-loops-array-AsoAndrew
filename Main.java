class Main {
  public static void main(String[] args) {
   // kindly use appropriate data types for your declaration
   //declare an array variable and assign the days of the month debtor defaulted,
   int[] daysDefaulted = {1, 2, 3, 4, 5, 6};
   
   // declare variables of amount the debtor is to pay per day, and amount the debtor paid and assign values to them
   int dailyAmountToPay = 100;
   int amountPaid = 350;
   
   // declare all the variables needed for your calculations

   // calculate and print total amount the debtor is to pay using for each loop
   int totalAmountToPay = 0;
   for (int day : daysDefaulted) {
     totalAmountToPay += dailyAmountToPay;
   }
   System.out.println("Total amount to pay: ₦" + totalAmountToPay);

   // calculate the days the debtor paid for and print the days in which was paid for starting from the left to the right of the array. 
   int daysPaidFor = amountPaid / dailyAmountToPay;
   System.out.println("Total days paid for: " + daysPaidFor);

   System.out.print("Days of the month paid for:");
   for (int i = 0; i < daysPaidFor; i++) {
     System.out.print(" " + daysDefaulted[i]);
   }
   System.out.println();

   // Also check if there was a day that the debtor did not pay the complete amount for that day, if yes, print the day and the amount left to pay for that day. 
   int incompleteAmount = amountPaid % dailyAmountToPay;
   if (incompleteAmount > 0) {
     int day = daysDefaulted[daysPaidFor];
     int amountLeft = dailyAmountToPay - incompleteAmount;
     
     System.out.print("Amount left to pay on day " + day + ": ");
     System.out.println("₦" + amountLeft);
   }

   // calculate amount the debtor is left to pay if he did not pay complete fees and the days not paid for or  check if the debtor paid extra and the extra amount he paid for, or if he paid the exact amount needed to be paid and print likewise
   if (amountPaid < totalAmountToPay) {
     int amountLeft = totalAmountToPay - amountPaid;
     System.out.println("Amount left to pay: ₦" + amountLeft);
   } else if (amountPaid > totalAmountToPay) {
     int extra = amountPaid - totalAmountToPay;
     System.out.println("Extra amount paid: ₦" + extra);
   } else {
     System.out.println("Exact amount paid");
   }
  }
}