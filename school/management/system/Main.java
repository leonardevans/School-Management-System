package school.management.system;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    static String option;
    static Scanner input = new Scanner(System.in);
    static List<Student> studentList = new ArrayList<>();
    static List<Teachers> teachersList = new ArrayList<>();
    static School mbaghala = new School(teachersList,studentList);

    public static void main(String[] args) {

        /**
         * calling/invoking the display method
         */
        display();

//        Teachers lizzy = new Teachers(1, "Lizzy", 500);
//        Teachers mellisa = new Teachers(2, "Mellisa", 700);
//        Teachers vanderhorn = new Teachers(3, "Vanderhorn", 600);
//
//        List<Teachers> teachersList = new ArrayList<>();
//        teachersList.add(lizzy);
//        teachersList.add(mellisa);
//        teachersList.add(vanderhorn);
//
//        Student tamasha = new Student(1, "Tamasha", 4);
//        Student rakshith = new Student(2, "Rakshith", 12);
//        Student rabbi = new Student(3, "Rabbi", 5);
//
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(tamasha);
//        studentList.add(rabbi);
//        studentList.add(rakshith);
//
//        School ghs = new School(teachersList,studentList);
//
//        Teachers megan = new Teachers(6,"Megan", 900);
//        ghs.addTeachers(megan);
//
//        tamasha.payFees(5000);
//        System.out.println("GHS School has earned: $" + ghs.getTotalMoneyEarned());
//
//        rakshith.payFees(6000);
//        System.out.println("GHS School has earned: $" + ghs.getTotalMoneyEarned());
//
//        System.out.println("______________MAKING GHS PAY SALARY_________________");
//        lizzy.recieveSalary(lizzy.getSalary());
//        System.out.println("GHS has spent money by paying $"+ lizzy.getSalary() + " to " + lizzy.getName() +
//                " and now has $"  + ghs.profitMade());
//
//        vanderhorn.recieveSalary(vanderhorn.getSalary());
//        System.out.println("GHS has spent money by paying $"+ vanderhorn.getSalary() + " to " + vanderhorn.getName() +
//                " and now has $"  + ghs.profitMade());
//
//        System.out.println(rakshith);
//        System.out.println(mellisa);


    }

    /**
     * create the display method to show the starting menu
     */

    public static void display(){
        System.out.println("___WELCOME TO MBAGHALA SCHOOL___");
        System.out.println("1. School \n2. Students \n3. Teachers \n4. Exit");
        option = input.next();

        /**
         * repeat the menu if the user enters invalid option until a valid option is entered
         */

        while (!option.equals("1") && !option.equals("2") && !option.equals("3") && !option.equals("4")){
            System.out.println("Invalid option! Please try again.");
            System.out.println("___WELCOME TO MBAGHALA SCHOOL___");
            System.out.println("1. School \n2. Students \n3. Teachers \n4. Exit");
            option = input.next();
        }

        if ( option.equals("1")){
            school();
        }
        else if(option.equals("2")){
            students();
        }
        else if(option.equals("3")){
            teachers();
        }
        else if(option.equals("4")){
            System.exit(0);
        }
    }

    public static void school(){
        System.out.println("1. Check Teachers \n2. Check Students \n3. Finance \n4. Back");
        option = input.next();

        while (!option.equals("1") && !option.equals("2") && !option.equals("3") && !option.equals("4")) {
            System.out.println("Invalid option! Please try again.");
            System.out.println("1. Check Teachers \n2. Check Students \n3. Finance \n4. Back");
            option = input.next();
        }

        if (option.equals("1")){
            if(teachersList.isEmpty()){
                System.out.println("No teachers added!");
                school();
            }
            else {
                int size = teachersList.size();
                System.out.println("# \tName \t\tSalary \tPaid \tRemaining");
                for (int i = 0; i < size; i++) {
                    System.out.println((i+1) + "\t" + teachersList.get(i).getName()+ "\t\t" + teachersList.get(i).getSalary() + "\t" + teachersList.get(i).getSalaryEarned() + "\t" + teachersList.get(i).getRemainingSalary());
                }

                school();
            }
        }
        else if (option.equals("2")){
            if(studentList.isEmpty()){
                System.out.println("No students added!");
                school();
            }
            else {
                int size = studentList.size();
                System.out.println("# \tName \t\tGrade \tFees paid \tBalance");
                for (int i = 0; i < size; i++) {
                    System.out.println((i+1) + "\t" + studentList.get(i).getName()+ "\t\t" + studentList.get(i).grade() + "\t\t" + studentList.get(i).getFeesPaid() + "\t\t" + studentList.get(i).getRemainingFees());
                }

                school();
            }
        }
        else if (option.equals("3")){
            finance();
        }

        else if (option.equals("4")){
            display();
        }
    }

    public static void students(){
        System.out.println("1. Add Student \n2. Select Student \n3. Back");
        option = input.next();
        while (!option.equals("1") && !option.equals("2") && !option.equals("3")){
            System.out.println("Invalid option! Please try again.");
            System.out.println("1. Add Student \n2. Select Student \n3. Back");
            option = input.next();
        }

        if (option.equals("1")){
            boolean badInput = true;
            int id = 0;
            while(badInput){
                try{
                    System.out.println("Enter the student's id: ");
                    id = input.nextInt();
                    if (id>0){
                        badInput = false;
                    }else{
                            System.out.println("ID should be a whole number.");
                    }
                }
                catch (InputMismatchException e){
                    System.out.println("ID should be a whole number.");
                    input.nextLine();
                }
            }


            input.nextLine();
            System.out.println("Enter the student's name: ");
            String name = input.nextLine();
            boolean badGrade = true;
            int grade = 0;
            while(badGrade){
                try {
                    System.out.println("Enter the student's grade: ");
                    grade = input.nextInt();
                    if (grade >=1 && grade <=6){
                        badGrade = false;
                    }
                    else{
                            System.out.println("Grade should be  between 1 and 6.");
                    }
                }
                catch (InputMismatchException e){
                    System.out.println("Grade should be a whole number between 1 and 6.");
                    input.nextLine();
                }
            }

            Student student = new Student(id,name,grade);
            mbaghala.addStudents(student);

                System.out.println("Student added successfully!");
                students();

        }
        else if (option.equals("2")) {
            int size = studentList.size();
            if (size <=0){
                System.out.println("No student added!");
                students();
            }
            int ids[] = new int[size];
            System.out.println("ID \tName \t\tGrade \tFees paid \tBalance");
            for (int i = 0; i < size; i++) {
                System.out.println(studentList.get(i).getId() + "\t" + studentList.get(i).getName() + "\t\t" + studentList.get(i).grade() + "\t\t" + studentList.get(i).getFeesPaid() + "\t\t" + studentList.get(i).getRemainingFees());
                ids[i] = studentList.get(i).getId();

            }
            System.out.println("Enter the student's id: ");
            option = input.next();
            boolean found = false;
            for (int i = 0; i < size; i++) {
                int id = ids[i];
                if (option.equals(Integer.toString(id))){
                    found = true;
                    payEditStudent(i);

                }
            }

            if (found == false){
                System.out.println("No such student!");
                students();
            }


        }
        else if (option.equals("3")){
            display();
        }

    }

    public static void teachers(){
        System.out.println("1. Add Teacher \n2. Select Teacher \n3. Back");
        option = input.next();

        while (!option.equals("1") && !option.equals("2") && !option.equals("3")){
            System.out.println("Invalid option! Please try again.");
            System.out.println("1. Add Teacher \n2. Select Teacher \n3. Back");
            option = input.next();
        }

        if (option.equals("1")){
            boolean invalidID = true;
            int n = 0, id = 0;
            while(invalidID) {
                try {
                    System.out.println("Enter the teacher's id: ");
                    id = input.nextInt();
                    if (id>0){
                        invalidID = false;
                    }
                    else{
                        n++;
                        invalidID = true;
                        System.out.println("The teachers ID should be a whole number.");
                    }
                }
                catch (InputMismatchException e){
                    System.out.println("The teachers ID should be a whole number.");
                    input.nextLine();
                }
            }
            input.nextLine();
            System.out.println("Enter the teachers's name: ");
            String name = input.nextLine();

            boolean invalidSalary = true;
            int salary = 0, m = 0;
            while(invalidSalary){
                try{
                    System.out.println("Enter the teachers's salary: ");
                    salary = input.nextInt();
                    if(salary >= 10000){
                        invalidSalary = false;
                    }
                    else{
                        m++;
                        System.out.println("Teachers salary should be at least $10000");
                    }
                }
                catch (InputMismatchException e){
                    System.out.println("Teachers salary should be a number.");
                    input.nextLine();
                }
            }

            Teachers teacher = new Teachers(id,name,salary);

            mbaghala.addTeachers(teacher);
            System.out.println("Teacher added Successfully.");
            teachers();

        }
        else if (option.equals("2")){
            int size = teachersList.size();
            if (size <=0){
                System.out.println("No teachers added!");
                teachers();
            }
            int ids [] = new int[size];
            System.out.println("ID \tName \t\tSalary");
            for (int i = 0; i < size; i++) {
                System.out.println(teachersList.get(i).getId() + "\t" + teachersList.get(i).getName() + "\t\t" + teachersList.get(i).getSalary());
                ids[i] = teachersList.get(i).getId();

            }
            System.out.println("Enter the teacher's id: ");
            option = input.next();
            boolean found = false;
            for (int i = 0; i < size; i++) {
                int id = ids[i];
                if (option.equals(Integer.toString(id))){
                    found = true;
                    payEditTeacher(i);
                }
            }

            if (found == false){
                System.out.println("No such teacher!");
                teachers();
            }
        }
        else if (option.equals("3")){
            display();
        }

    }

    public static void finance(){
        System.out.println("1. Check School balance \n2. Check Amount Earned \n3. Check Amount Spent \n4. Back");
        option = input.next();
        while (!option.equals("1") && !option.equals("2") && !option.equals("3") && !option.equals("4")){
            System.out.println("Invalid option! Please try again.");
            System.out.println("1. Check School balance \n2. Check Amount Spent \n3. Check Student's balance \n4. Back");
            option = input.next();
        }

        if (option.equals("1")){
            System.out.println("The profit made by the school is: " + mbaghala.profitMade());
            finance();

        }
        else if (option.equals("2")){
            System.out.println("The total money earned by the school is: " + mbaghala.getTotalMoneyEarned());
            finance();
        }
        else if (option.equals("3")){
            System.out.println("The total money spent by the school is: " + mbaghala.getTotalMoneySpent());
            finance();
        }
        else if (option.equals("4")){
            school();
        }
    }

    /**
     * create function to pay fees and edit student details
     */

    public static void payEditStudent(int index){
        System.out.println("1. Pay Fees \n2. Edit details \n3. Cancel");
        option = input.next();
        while (!option.equals("1") && !option.equals("2") && !option.equals("3")){
            System.out.println("Invalid option! Please try again.");
            System.out.println("1. Pay Fees \n2. Edit details \n3. Cancel");
            option = input.next();
        }
        if(option.equals("1")){
            int fees = 0;
            boolean invalidFee = true;

            while(invalidFee){
                try {
                    System.out.println("Enter amount to pay");
                    fees = input.nextInt();
                    if (fees >= 500){
                        invalidFee = false;
                    }
                    else{
                            System.out.println("Fees should be at least $500.");
                    }
                }
                catch (InputMismatchException e){
                    System.out.println("Fees should be an a number and at least $500.");
                    input.nextLine();
                }
            }

            studentList.get(index).payFees(fees);
            System.out.println(fees + " successfully paid for " + studentList.get(index).getName() + ". The remaining balance is " + studentList.get(index).getRemainingFees() + ".");
            students();
        }
        else if (option.equals("2")){
            System.out.println("Edit Student's name: " + studentList.get(index).getName());
            String name = input.nextLine();
            input.nextLine();

            boolean badGrade = true;
            int grade = 0;
            while(badGrade){
                try {
                    System.out.println("Edit Student's grade: " + studentList.get(index).grade());
                    grade  = input.nextInt ();
                    if (grade >=1 && grade <=6){
                        badGrade = false;
                    }
                    else{
                            System.out.println("Grade should be  between 1 and 6.");
                    }
                }
                catch (InputMismatchException e){
                    System.out.println("Grade should be a whole number between 1 and 6.");
                    input.nextLine();
                }
            }

            studentList.get(index).setName(name);
            studentList.get(index).setGrade(grade);
            System.out.println("Student's details successfully updated.");
            students();
        }
        else if(option.equals("3")){
            students();
        }

    }

    /**
     * create function to pay teachers and edit teacher's details
     * @param index
     */

    public static  void payEditTeacher(int index){
        System.out.println("1. Pay Salary \n2. Edit details \n3. Cancel");
        option = input.next();

        while (!option.equals("1") && !option.equals("2") && !option.equals("3")){
            System.out.println("Invalid option! Please try again.");
            System.out.println("1. Pay Salary \n2. Edit details \n3. Cancel");
            option = input.next();
        }

        if(option.equals("1")){
            boolean invalidSalary = true;
            int salary = 0;
            while(invalidSalary){
                try{
                    System.out.println("Enter amount to pay");
                    salary = input.nextInt();
                    if(salary >= 5000){
                        invalidSalary = false;
                    }
                    else{
                        System.out.println("Teachers payment should be at least $5000");
                    }
                }
                catch (InputMismatchException e){
                    System.out.println("Teachers payment should be a number.");
                    input.nextLine();
                }
            }

            teachersList.get(index).recieveSalary(salary);
            System.out.println(salary + " successfully paid to " + teachersList.get(index).getName() + ". The remaining balance to be paid to " + teachersList.get(index).getName() + " is " + teachersList.get(index).getRemainingSalary());
            teachers();
        }
        else if (option.equals("2")){
            System.out.println("Edit teacher's name: " + teachersList.get(index).getName());
            String name = input.nextLine();
            input.nextLine();

            boolean invalidSalary = true;
            int salary = 0;
            while(invalidSalary){
                try{
                    System.out.println("Edit teacher's salary: " + teachersList.get(index).getSalary());
                    salary = input.nextInt();
                    if(salary >= 10000){
                        invalidSalary = false;
                    }
                    else{
                        System.out.println("Teachers salary should be at least $10000");
                    }
                }
                catch (InputMismatchException e){
                    System.out.println("Teachers salary should be a number.");
                    input.nextLine();
                }
            }

            teachersList.get(index).setName(name);
            teachersList.get(index).setSalary(salary);
            System.out.println("teachers's details successfully updated.");
            teachers();
        }
        else if(option.equals("3")){
            teachers();
        }

    }


}
