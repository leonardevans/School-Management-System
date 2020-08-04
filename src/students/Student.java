package students;

public class Student {
    private int id;
    private String name;
    private int grade;//grade 1, grade 2, grade 3...
    private int totalFees;
    private int paidFees;


    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.paidFees = 0;
        //we have set constant total fees
        this.totalFees = 30000;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getTotalFees() {
        return totalFees;
    }

    public void setTotalFees(int totalFees) {
        this.totalFees = totalFees;
    }

    public int getPaidFees() {
        return paidFees;
    }

    public void setPaidFees(int paidFees) {
        this.paidFees = paidFees;
    }

    //get fee balance
    public int getFeeBalance(){
        return totalFees - paidFees;
    }

    public void payFees(int fee){
        paidFees += fee;
    }
}
