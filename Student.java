import java.time.LocalDate;

public class Student extends  Person {
    private String StudentCode;
    private String SchoolName;
    private int YearOfAdmission;
    private double GPA;
    public Student(){}
    public Student(String name, LocalDate DoB, String address, double height, double weight, String studentCode, String schoolName, int yearOfAdmission, double GPA) {
        super(name, DoB, address, height, weight);
        this.StudentCode = studentCode;
        this.SchoolName = schoolName;
        this.YearOfAdmission = yearOfAdmission;
        this.GPA = GPA;
    }

    public String getStudentCode() {
        return StudentCode;
    }

    public void setStudentCode(String studentCode) {
        StudentCode = studentCode;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public int getYearOfAdmission() {
        return YearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        YearOfAdmission = yearOfAdmission;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    @Override
    public String toString(){
        return super.toString() + "\n"
                +"Ma so SV : " + this.StudentCode + "\n"
                +"Truong : " + this.SchoolName + "\n"
                +"Nam nhap hoc : " + this.YearOfAdmission + "\n"
                +"GPA : " + this.GPA + "\n"
                ;
    }
}
