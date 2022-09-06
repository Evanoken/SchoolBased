package School_Management_System;

import java.util.ArrayList;
import java.util.List;

public class MAIN {
    public static void main(String[] args) {
        Teacher liz = new Teacher(1,"liz",5000);
        Teacher Milka = new Teacher(2,"Milka",6000);
        Teacher Dennis= new Teacher(3,"Dennis",6500);

        List<Teacher> teacherList =new ArrayList<>();
        teacherList.add(liz);
        teacherList.add(Milka);
        teacherList.add(Dennis);

        Student Alice = new Student(1,"Alice",4);
        Student Ben = new Student(2,"Ben",12);
        Student rabbi = new Student(3,"Rabbi",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Alice);
        studentList.add(Ben);
        studentList.add(rabbi);

        School ghs = new School(teacherList,studentList);
        Teacher Ken = new Teacher(5,"Ken",3000);
        ghs.addTeacher(Ken);

        Alice.payFees(10000);
        Ben.payFees(12000);
        System.out.println("GHS has earned $"+ghs.getTotalMoneyEarned() + " only");

        System.out.println("**********Teachers Payments ***********");

        liz.receiveSalary(liz.getSalary());
        System.out.println("GHS has spent for salary to "+ liz.getName() + "and now has $" +ghs.getTotalMoneyEarned());

        Milka.receiveSalary(Milka.getSalary());
        System.out.println("GHS has spent for salary to "+ Milka.getName() + " and now has $" +ghs.getTotalMoneyEarned());

        System.out.println(Alice);
        System.out.println(liz);
    }
}
