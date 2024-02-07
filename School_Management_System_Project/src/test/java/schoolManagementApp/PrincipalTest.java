package schoolManagementApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrincipalTest {

    @Test
    void admitApplicants() {
        Principal principal = new Principal();
        Applicants applicants = new Applicants();
        String actual = principal.admitApplicants(applicants);
        boolean expected = true;

    }

    @Test
    void expelStudent() {
        Principal principal = new Principal();
        Student student = new Student();
       String  actual = principal.expelStudent(student);
       boolean expected = true;


    }
}