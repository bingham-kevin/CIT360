public class Student {

    //Variables
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    private String grade;
    private int gradeLevel;
    private boolean enrolled = true;

    public boolean isEnrolled() {
        return enrolled;
    }

    public void setEnrolled(boolean enrolled) {
        this.enrolled = enrolled;
    }

    public Student(String name, String grade, int gradeLevel) {
        this.name = name;
        this.grade = grade;
        this.gradeLevel = gradeLevel;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }
}
