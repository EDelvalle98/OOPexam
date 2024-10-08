package exam;

public abstract class Employee extends Customer implements Payable,TerminateAble{
    protected final double DISCOUNT = 0.10;

    public Employee(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }

    @Override
    public abstract void printInfo();

    @Override
    public abstract void printPriceAfterDiscount(Cloth[] clothingItems);

    @Override
    public double printPriceAfterDiscount() {
        return 0;
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }

    @Override
    public double calculatePay() {

        return 0;
    }

    @Override
    public boolean canGetFired() {
        return false;
    }

    @Override
    public boolean payTaxOnEarnings() {
        return false;
    }
}
