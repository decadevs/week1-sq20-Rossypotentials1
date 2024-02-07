package schoolManagementApp;

public class Staff implements School {
    public Staff(String staffName, String staffRole, int staff_ID) {
        this.staffName = staffName;
        this.staffRole = staffRole;
        this.staff_ID = staff_ID;
        this.staffAge = getStaffAge();
    }
    public Staff (){

    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffRole() {
        return staffRole;
    }

    public void setStaffRole(String staffRole) {
        this.staffRole = staffRole;
    }

    public int getStaff_ID() {
        return staff_ID;
    }

    public void setStaff_ID(int staff_ID) {
        this.staff_ID = staff_ID;
    }

    private String staffName;
    private String staffRole;
    private int staff_ID;

    public int getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(int staffAge) {
        this.staffAge = staffAge;
    }

    private int staffAge;


    public String role(){
        if(staffRole.equalsIgnoreCase("principal")){
            return "You are the Principal";
        } else if (staffRole.equalsIgnoreCase("teacher")) {
            return "You are a teacher";
        } else if (staffRole.equalsIgnoreCase("Cleaner")) {
            return "Non academic Staff";
        }  else if (staffRole.equalsIgnoreCase("Driver")) {
            return "Non academic Staff";
        } else if (staffRole.equalsIgnoreCase("Typist")) {
            return "Non academic Staff";
        } else if (staffRole.equalsIgnoreCase("Cook")) {
            return "Non academic Staff";
        } else if (staffRole.equalsIgnoreCase("Nanny")) {
            return "Non academic Staff";
        } else
            return "Sorry, You are Not a Staff of Royal Academy.";
    }

    //Implements Interface
    @Override
    public void school(String school) {
        System.out.println("Name of School: " + school);
    }
}
