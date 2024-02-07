package schoolManagementApp;

abstract class Course {
    //Declare Variables
    private String courseTitle;
    private int courseCode;
    private String courseTeacher;

    //Abstract Method
    abstract void courseCurriculum();
    abstract void classLevel();

    //Constructor
    Course(){
        System.out.println("List of Courses");
    }

    //Methods
    public void passCourse(int score) {
        score=100;
        if (score >=90 && score <=100) {
            System.out.println("Your grade is A! Keep the candle burning");
        } else if (score >=80 &&  score <=89) {
            System.out.println("Your grade is B! you are doing well");
        } else if (score >=60 && score <=79) {
            System.out.println("Your grade is C! you can do better");
        } else if (score >= 50 && score <=69) {
            System.out.println("Your grade is D! There's still room for improvement");
        } else if (score >= 40 && score <= 49 ) {
            System.out.println("Your grade is F! you failed,please sit up!");
        }else {
            System.out.println("You did not take this course");
        }
    }
    public String getCourseTitle() {
        return courseTitle;
    }
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }


}
