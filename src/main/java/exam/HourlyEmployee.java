package exam;

public class HourlyEmployee extends Employee{
    private float hoursWorked;
    private double hourlyWage;

    public HourlyEmployee(String name, Size size, Cloth[] clothingItems, float hoursWorked, double hourlyPay) {
        super(name, size, clothingItems);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyPay;
    }


    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public void printInfo() {
        System.out.println();
    }

    @Override
    public void printPriceAfterDiscount(Cloth[] clothingItems) {

    }
}
