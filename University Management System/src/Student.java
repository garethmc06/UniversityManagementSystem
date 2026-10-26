public class Student extends Person{
    private double gpa;
    private String course;

    public Student(String ID, String name, String email, double gpa, String course) {
        super(name, ID, email);
            this.gpa = gpa;
            this.course = course;
    }

    // Getter and Setters

    public double getGpa() {
        return gpa;
    }

    public String getCourse() {
        return course;
    }

    public void setGpa(double newGpa) {
        this.gpa = newGpa;
    }
    public void setCourse(String newCourse) {
        this.course = newCourse;
    }

    @Override
    public String getDetails(){
        return super.getDetails()+ "\n" +"GPA: " + gpa + "\n" + "Course: " + course;
    }


}


