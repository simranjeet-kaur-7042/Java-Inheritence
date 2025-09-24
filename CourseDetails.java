//Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
// Tasks:Define a superclass Course with attributes like courseName and duration.
// Define OnlineCourse to add attributes such as platform and isRecorded.
// Define PaidOnlineCourse to add fee and discount.

class Course{
   protected String courseName;
   protected int duration;

   Course(String courseName,int duration){
    this.courseName=courseName;
    this.duration=duration;
   }

   public void showCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }

}
class OnlineCourse extends Course{
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

     public void showCourseDetails() {
        super.showCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }


}
class PaidOnlineCourse extends OnlineCourse{
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    public void showCourseDetails() {
        super.showCourseDetails();
        System.out.println("Fee: Rs." + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee after discount: Rs." + calculateFinalFee());
    }
}

public class CourseDetails {
    public static void main(String[] args) {
        PaidOnlineCourse p = new PaidOnlineCourse(
                "Java Programming", 
                40, 
                "Udemy", 
                true, 
                20000.0, 
                15.0
        );

        p.showCourseDetails();
    }
}