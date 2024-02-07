package schoolManagementApp;

public class Class  extends Student{
    String classGrade = "Grade 3";
     String classTeacher = "Miss   Josephine";


    @Override
    void courseCurriculum() {
        System.out.println("Come to the cafeteria by 2pm for Your printed Curriculum, based on class ");
    }

    //Abstract Method
    void classLevel(){
        System.out.println("You are in class  " + classGrade);
    }

    //Class method
    public void studentClass(){
        System.out.println(" You are in " + classGrade + " and Your Class Teacher is " + classTeacher);
    }



}
