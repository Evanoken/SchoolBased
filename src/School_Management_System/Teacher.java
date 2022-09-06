package School_Management_System;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    Teacher(int id, String name, int salary){
        this.id = id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * Adds to the salary
     * @param salary for teachers
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the teacher is " +name+ ", Total salary paid so far is $" +salaryEarned;
    }
}
