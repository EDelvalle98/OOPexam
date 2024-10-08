package exam;

public class UtilityMethods {
    public static double calculateSubtotal(Cloth[] clothingItems){
        double currentTotal = 0;
        for (int x = 0; x < clothingItems.length; x++) {
            currentTotal += clothingItems[x].getPrice();
        }
        return currentTotal;
    }
    public static boolean checkFitting(Customer customer, Cloth cloth){
        return customer.getSize() == cloth.getSize();
    }

    public static boolean checkCustomerDiscount(Customer customer){
        return customer instanceof Manager;
    }
}
