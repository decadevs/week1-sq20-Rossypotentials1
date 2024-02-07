package schoolManagementApp;

public class Applicants {
    private  String applicantName;
    private int applicantAge;

    public Applicants(){

    }

    public Applicants(String applicantName, int applicantAge) {
        this.applicantName = applicantName;
        this.applicantAge = applicantAge;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public int getApplicantAge() {
        return applicantAge;
    }

    public void setApplicantAge(int applicantAge) {
        this.applicantAge = applicantAge;
    }
    public  void apply(){
        System.out.println("I "  + getApplicantName() +  "humbly seek to apply into your prestigious school on behalf of my ward." +
                "I will appreciate if my ward gets admitted into Royal Academy" );
    }


}
