package schoolManagementApp;

public class Principal extends Staff{
    public String admitApplicants(Applicants applicants){
        if(applicants.getApplicantAge() < 9){
            return "Sorry, You're Not eligle";
        }else
            return  "Dear " + applicants.getApplicantName() + ", Congratulation, You have been admitted into Royal Academy" + getClass();
    }
    public String expelStudent(Student student){
        if(student.isStubborn() && student.isFighting()){
            return "You have been expelled from Royal Academy due to your " +
                    "unceasant stubbornness and constant fighting with your fellow students";

        }return " Be of Good Behaviour and Conduct Yourself always!";
    }

    public String suspendStudent(Student student){
        if(student.isStubborn()){

        } return student.getStudentName() + " You have been suspended from Royal Academy effective from Today. Your to resume on ";
    }

}
