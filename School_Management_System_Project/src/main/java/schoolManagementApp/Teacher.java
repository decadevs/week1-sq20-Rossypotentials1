package schoolManagementApp;

public class Teacher extends Staff {
    //Declaring Variables
    private String courseTitle;

    private int course_ID;

    private String classAssigned;


    //Constructors
    public Teacher(String courseTitle, int course_ID, String classAssigned) {
        this.courseTitle = courseTitle;
        this.course_ID = course_ID;
        this.classAssigned = classAssigned;
    }

    public Teacher(String staffName, String staffRole, int staff_ID, String courseTitle, int course_ID, String classAssigned) {
        super(staffName, staffRole, staff_ID);
        this.courseTitle = courseTitle;
        this.course_ID = course_ID;
        this.classAssigned = classAssigned;
    }
    //Default constructor to facilite inheritance
    public Teacher(){}

    //Teach Method

    public void teachCourse(){
        System.out.println("Teacher teaches  students based on class");
    }



    //Getters and Setters Methods
    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitgle) {
        this.courseTitle = courseTitle;
    }

    public int getCourse_ID() {
        return course_ID;
    }

    public void setCourse_ID(int course_ID) {
        this.course_ID = course_ID;
    }

    public String getClassAssigned() {
        return classAssigned;
    }

    public void setClassAssigned(String classAssigned) {
        this.classAssigned = classAssigned;
    }

    public void teaches(){
        System.out.println(getStaffName() + ",You are a good teacher");
    }

}
