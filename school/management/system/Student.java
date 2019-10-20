package school.management.system;

/*class responsible for keeping the track of student's fees,
* name, grade and fees paid*/

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;



    /**constructor to create a new student object by initializing the values
    *@param id id for the student: unique
    * @param name name of the student
    * @param grade grade of the student
    * */

    public Student(int id,String name, int grade){
        this.feesPaid = 0;
        this.feesTotal = 30_000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }



    /**
     * setGrade method iis ude to update student's grade
     * @param grade new grade of the student
     **/

    public void setGrade(int grade){
        this.grade = grade;
    }

    public void setName(String name){
        this.name = name;
    }

    /**
     * Add fees to the feesPaid
     * @param fees*/

    public void payFees(int fees){
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**return the id of the student*/

    public int getId(){
        return this.id;
    }

    /**return the name of the student*/

    public String getName(){
        return this.name;
    }

    /**@return  grade of the student*/

    public int grade(){
        return  this.grade;
    }

    /**@return fees paid by the student*/

    public  int getFeesPaid(){
        return feesPaid;
    }

    /**@return total fees*/

    public int getFeesTotal(){
        return this.feesTotal;
    }

    /**
     *
     * @return the fee balance
     */

    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString(){
        return "Student's name: " + name + ", Total fees paid so far: $" + feesPaid;
    }
}
