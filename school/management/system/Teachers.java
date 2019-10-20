package school.management.system;

//teachers class is responsible for keeping the track of teacher's name, id and salary

public class Teachers {

        private int id;
        private String name;
        private  int salary;
        private int salaryEarned;

        public Teachers(int id, String name, int salary){
            this.id = id;
            this.name = name;
            this.salary  = salary;
            this.salaryEarned = 0;
        }

    /**
     *
     * @return id of the teacher
     */

    public int getId(){
            return  this.id;
        }

    /**
     * Return name of the teacher
     * @return
     */

    public String getName(){
            return this.name;
        }

    public void setName(String name){
        this.name = name;
    }

    /**

     * @return salary of the teacher
     */

    public int getSalary(){
            return this.salary;
        }

    /**
     * set salary of the teacher
     * @param salary
     */

    public void setSalary(int salary){
            this.salary = salary;
        }

    /**
     * Adds to the salary to salary aerned
     * updates the total money earned by school by substracting the salary
     * @param salary
     */

    public void recieveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
        }

        public int getSalaryEarned(){
        return  salaryEarned;
        }

        public int getRemainingSalary(){
        return getSalary() - getSalaryEarned();
        }

        @Override
    public  String toString(){
        return "Name of the teacher: " + name + ", Total salary earned so far: $" + salaryEarned;
        }

}
