package exam;

public class Student extends Customer{
    private long studentID;
    private static long studentsCounter;
    private final double DISCOUNT = .05;

    public Student(String name, Size size, Cloth[] clothingItems) {
        super(name, size, clothingItems);
    }

    @Override
    public void printPriceAfterDiscount(Cloth[] clothingItems) {

    }

    public long getStudentID() {
        studentsCounter++;
        this.studentID = studentsCounter;
        return studentID;
    }

    public void setStudentID(long studentID) {

        this.studentID = studentID;
    }

    public static long getStudentsCounter() {

        return (studentsCounter);
    }

    public static void setStudentsCounter(long studentsCounter) {

        Student.studentsCounter = studentsCounter;
    }

    public double getDISCOUNT() {

        return DISCOUNT;
    }

    public void printStudentsCounter(){

        System.out.println(studentsCounter);
    }
    @Override
    public double printPriceAfterDiscount() {
        return 0;
    }
    @Override
    public void printInfo() {
        System.out.println("Student ID " + getStudentID() + " Student Name: " + getName());


    }
}
