import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Validate {
    public static final int MAX_NAME_LENGTH = 100;
    public static final int MAX_ADDRESS_LENGTH = 300;
    public static final double MIN_HEIGHT = 50.0;
    public static final double MAX_HEIGHT = 300.0;
    public static final double MIN_WEIGHT = 5.0;
    public static final double MAX_WEIGHT = 1000.0;
    public static final int MAX_STUDENTCODE_LENGTH = 10;
    public static final String DEFAULT_SCHOOLNAME = "Unknown";
    public static final double MIN_GPA = 0.0;
    public static final double MAX_GPA = 10.0;

    Scanner scn=new Scanner(System.in);
    public static List<Student> StudentList= new ArrayList<>();
    public Validate(){

    }
    public void CreateStudent(){

        String name = inputName();
        LocalDate DoB = inputDoB() ;
        String address = inputAddress();
        double height = inputHeight();
        double weight = inputWeight();
        String StudentCode = inputStudentCode();
        String SchoolName = inputSchoolName();
        int YearOfAdmission = inputYearofAdmission();
        double GPA= inputGPA();
        Student student = new Student(name,DoB,address,height,weight,StudentCode,SchoolName,YearOfAdmission,GPA);
        StudentList.add(student);
        System.out.println(student.toString());
    }
    private String inputName(){
        System.out.println("Enter Name :");
        String name=scn.nextLine();
        if(name.length()<MAX_NAME_LENGTH){
            return name;
        }
        return inputName();
    }

    private  String inputAddress(){
        System.out.println("Enter address : ");
        String address = scn.nextLine();
        if(address.length()<MAX_ADDRESS_LENGTH){
            return address;
        }
        return inputAddress();
    }

    private LocalDate inputDoB(){
        System.out.println("Enter date of birth (format yyyy-mm-dd) :");
        String inputDate=scn.nextLine();
        LocalDate date=LocalDate.parse(inputDate);
        if(date.getYear()>1900) {
            return date;
        }
        return inputDoB();
    }

    private double inputHeight(){
        System.out.println("Enter height : ");
        double height=scn.nextDouble();
        if(height>50 && height<300){
            return height;
        }
        return inputHeight();
    }

    private double inputWeight(){
        System.out.println("Enter weight : ");
        double weight= scn.nextDouble();
        if(weight>5 && weight<1000) {
            return weight;
        }
        return inputWeight();
    }

    private String inputStudentCode(){
        System.out.println("Enter student code : ");
        String StudentCode = scn.nextLine();
        if(StudentCode.length()==10 && StudentCode.chars().distinct().count()==10){
            return StudentCode;
        }
        return inputStudentCode();
    }

    private int inputYearofAdmission(){
        System.out.println("Enter year of admission : ");
        int year=scn.nextInt();
        return year;
    }

    private  String inputSchoolName(){
        System.out.println("Enter school name : ");
        String schoolName= scn.nextLine();
        return schoolName;
    }

    private  double inputGPA(){
        System.out.println("Enter GPA : ");
        double GPA=scn.nextDouble();
        if(GPA>=MIN_GPA && GPA <=MAX_GPA){
            return GPA;
        }
        return inputGPA();
    }
}
