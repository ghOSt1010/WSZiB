package com.zadanie2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Employee> ArrEmp = new ArrayList<Employee>(3);
        Employee Emp = null;

        String selection;
        boolean endOfProgram = false;
        int counter = 0;

        while (!endOfProgram) {

            System.out.println("Would you like to add new Employee? Y/N");

            selection = scanner.nextLine();

            if (selection.equals("y") || selection.equals("Y")) {

                System.out.println("Please provide name: ");
                String Name = scanner.nextLine();
                System.out.println("Please provide surname: ");
                String Surname = scanner.nextLine();

                String fullname = Surname+Name;

                for (Employee x : ArrEmp) {

                    if(fullname.equals(x.surname+x.name)){
                        System.out.println("Found: " + fullname);
                        counter ++;

                        if (counter > 0){
                            Surname = Surname+counter;
                        }

                    }
                }

                Emp = new Employee(Name, Surname);
                ArrEmp.add(Emp);
                System.out.println("Generated email: " + Emp.getEmail());

            } else {

                if (selection.equals("n") || selection.equals("N")) {

                    System.out.println("Bye bye! :)");

                    for (Employee x : ArrEmp) {

                        System.out.println(x.getEmail());

                    }

                    endOfProgram = true;

                }

            }

        }

    }
}

