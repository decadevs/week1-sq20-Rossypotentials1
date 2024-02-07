package schoolManagementApp;

public class Student extends Course implements School{
    private String studentName;
    private int student_Age;
    private int student_ID;
    private boolean fighting;

    void courseCurriculum(){
        System.out.println("Here's your course curriculum");
    }

    void takeCourse(){
        System.out.println(" Every student takes a course");
    }

    @Override
    void classLevel() {

    }

    public boolean isFighting() {
        return fighting;
    }

    public boolean isStubborn() {
        return stubborn;
    }

    public void setStubborn(boolean stubborn) {
        this.stubborn = stubborn;
    }

    private boolean stubborn;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudent_Age() {
        return student_Age;
    }

    public void setStudent_Age(int student_Age) {
        this.student_Age = student_Age;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    @Override
    public void school(String school) {
        System.out.println(" The name Of Your school is " + school);
    }



}
