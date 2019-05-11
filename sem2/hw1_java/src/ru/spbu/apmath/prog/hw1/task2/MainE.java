package ru.spbu.apmath.prog.hw1.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Количество работников");
        int number_staff = in.nextInt();
        List<Employee> staff = new ArrayList<>();

        for(int i = 0;i<number_staff;i++){
            System.out.println("Имя работника");
            String name = in.next();
            System.out.println("Зарплата в час");
            double salary_per_hour = in.nextDouble();
            System.out.println("Количество часов");
            int hours = in.nextInt();
            staff.add(new Employee(name,salary_per_hour,hours));
        }

        for(Employee employee:staff){
            try{
                System.out.println(employee.getName() + " " + employee.getSalary_per_hour() + " " +
                        employee.getHours() +  " " + employee.getSalary());

            }catch (IllegalStateException e){
                System.out.println(employee.getName() + " " + employee.getSalary_per_hour() + " "
                        + employee.getHours() +  " " + "Ошибка!");
            }

        }

    }

}