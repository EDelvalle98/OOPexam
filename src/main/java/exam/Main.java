package exam;

import static exam.Student.getStudentsCounter;

public class Main {
    public static void main(String[] args) {

Cloth clothingItem1 = new Cloth("jeans",50.0,Size.S);
Cloth clothingItem2 = new Cloth("T-shirt",8.0,Size.M);
Cloth clothingItem3 = new Cloth("hat",2.0,Size.L);

Cloth[] shoppingBag = {clothingItem1,clothingItem2,clothingItem3};
System.out.println(UtilityMethods.calculateSubtotal(shoppingBag));

Student student1 = new Student("Mike",Size.L,shoppingBag);
Student student2 = new Student("Jane",Size.S,shoppingBag);

Student[] listOfStudents = {student1,student2};
for (Student student: listOfStudents){
    student.printInfo();
}
        System.out.println("We have created "+getStudentsCounter()+" students in our database successfully");

HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Alex",Size.S,shoppingBag,40,20.0);

Manager manager1 = new Manager("Terry",100000,Size.L,shoppingBag);
manager1.printInfo();

        System.out.println(UtilityMethods.checkFitting(student1));

    }
}
