package School_Management_System;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

        public School(List<Teacher> teachers ,List<Student> students){
            this.teachers=teachers;
            this.students=students;
            totalMoneyEarned=0;
            totalMoneySpent=0;
        }

    /**
     *
     * @return the list of teacher
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * adds the teacher to the school
     * @param teacher
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     *
     * @param student
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     *
     * @param MoneyEarned
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneySpent -= MoneySpent;
    }
}
