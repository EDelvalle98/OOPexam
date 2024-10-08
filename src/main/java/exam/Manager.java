package exam;

public class Manager extends Employee{
    protected final double EXTRA_DISCOUNT = .05;
    private double salary;

    public Manager(String name,double salary, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
        this.salary = salary;
    }

    @Override
    public void printInfo() {
        System.out.println(getName() + " makes " + getSalary() + " and his shopping bag consist of the follow clothing items: Jeans T-shirt Hat");

    }

    @Override
    public void printPriceAfterDiscount(Cloth[] clothingItems) {

    }


    public double getEXTRA_DISCOUNT() {
        return EXTRA_DISCOUNT;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
