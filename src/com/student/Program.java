package com.student;


import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Student student1 = new Student("Uliana", 90);
        Student student2 = new Student("Semen", 93);
        Student student3 = new Student("Victoria", 85.5);

        System.out.println("1 "+student1);
        System.out.println("2 "+student2);
        System.out.println("3 "+student3);

        double aver1 = average(student1.getRating(), student2.getRating(), student3.getRating());
        System.out.println("\nAverage rat1ing of all students = "+ aver1);
        System.out.println("\nPlease enter the number of the student whose rating you want to change");
        int number = in.nextInt();
        if(number>4){
            System.out.println("\nYou input incorrect number ");
        }
       else {
            System.out.println("\nPlease enter new rating: ");
            double rating2 = in.nextDouble();
            if (number == 1) {
                student1.changeRating(rating2);
            }
            if (number == 2) {
                student2.changeRating(rating2);
            }
            if (number == 3) {
                student3.changeRating(rating2);
            }

            System.out.println("1 " + student1);
            System.out.println("2 " + student2);
            System.out.println("3 " + student3);

            double aver2 = average(student1.getRating(), student2.getRating(), student3.getRating());
            System.out.println("\nNew average rating of all students = " + aver2);
        }

}

    public static double average(double num1, double num2, double num3){
        double aver = (num1+ num2 + num3)/3;
        return aver;
    }
}

class Student {

    private String name;
    private double rating;

    Student(){}

    Student(String n, double r){
        name = n;
        rating = r;
    }

    public String getName() {
        return name;
    }
    public double getRating() {
        return rating;
    }


    public boolean betterStudent(double x, double y) {
        if (x>y) return true;
        else return false;
    }

    public void changeRating(double rating) {
        this.rating = rating;
    }

    public String toString()
    {
        return  name+ " - " + rating;
    }
}