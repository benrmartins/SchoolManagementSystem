package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 500);
        Teacher vanderhorn = new Teacher(3, "vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        Student tamasha = new Student(1, "Tamsha", 4);
        Student rakshith = new Student(2, "Ranshith", 12);
        Student rabbi = new Student(3, "Rabbi", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshith);
        studentList.add(rabbi);

        School ghs = new School(teacherList, studentList);
        tamasha.paidFees(5000);
        rakshith.paidFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());


        System.out.println("Making School Pay Salary");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("Ghs has spent for salary to " + lizzy.getName() + " and now has " + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("Ghs has spent for salary to " + vanderhorn.getName() + " and now has " + ghs.getTotalMoneyEarned());

        System.out.println(rakshith);
        System.out.println(mellisa);

    }
}