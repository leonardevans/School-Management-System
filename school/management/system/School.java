package school.management.system;

import java.util.List;

/**
 * The school can have many teachers, many students*/

public class School {
    private List<Teachers> teachers;
    private  List<Student> students;
    private static int totalMoneyEarned;
    private  static int totalMoneySpent;

    /**
     * new school object is created.
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.*/

    public School(List<Teachers> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * return the list of teachers in the school*/

    public List<Teachers> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     * @param teacher teacher to be added */

    public void addTeachers(Teachers teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of students in the school'
     */

    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school
     * @param student the student to be addedd
     */

    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money earned  by the school
     */

    public static int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     *Adds the total money earned by the school.
     * @param MoneyEarned money that is supposed to be added
     */

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent.
     */

    public static int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     *updates the money spent by the school.
     * which is the salary that the school pay to the teachers.
     * @param moneySpent money spent by the school.
     */

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
    }

    public static int profitMade(){
        return getTotalMoneyEarned() - getTotalMoneySpent();
    }
}
