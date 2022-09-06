package School_Management_System;
//This class is responsible for monitoring all the activities of students
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     *
     * @param Id
     * @param Name
     * @param Grade
     */
    public Student(int Id, String Name, int Grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        id=Id;
        name=Name;
        grade=Grade;

    }
    public void setGrade(int grade){
        this.grade= grade;
    }

    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name is: " +name+ " and the total fees paid so far $" +feesPaid;
    }
}
