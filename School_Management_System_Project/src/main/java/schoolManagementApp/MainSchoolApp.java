package schoolManagementApp;

public class MainSchoolApp {
    public static void main(String[] args) {
        //Staff Instantiation and Invoking of methods associated with Staff
        Staff staff =new Staff();
        staff.school("Royal Academy");
        staff.setStaffName(" Favour Ameh");
        staff.setStaffRole("Teacher");
        System.out.println(staff.getStaffName());
        System.out.println(staff.role());


        //Principal and Applicant Instantiation and Invoking of methods associated with principal
        Principal principal = new Principal();
        Applicants applicants = new Applicants();
        applicants.apply();
        applicants.setApplicantName(" Isioma Uzoiqwu");
        applicants.setApplicantAge(12);
        String authority = principal.admitApplicants(applicants);
        System.out.println(authority);


        //Instantiation of Student class and calling of method

        Student student = new Student();
        student.passCourse(70);
        student.setStudentName(" Jotham");
        student.setStubborn(true);
        String response = principal.suspendStudent(student);
        System.out.println( response);
        student.takeCourse();

        //Instantiation of Abstract class Course  and calling of method
        Course courseObj =new Student();
        courseObj.passCourse(69);


        //Instantiation of Class_ class and calling of method
        Class class1 = new Class();
        class1.studentClass();


        //Instantiation of Teacher class and calling of method
        Teacher teacher = new Teacher();
        teacher.teachCourse();

        //Instantiation of Nonacademic class and calling of method
        NonAcademicStaff nonAcademicStaff = new NonAcademicStaff();
        nonAcademicStaff.jobTitle();





















    }
}
