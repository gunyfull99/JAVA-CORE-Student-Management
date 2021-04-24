
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {

      static Scanner in = new Scanner(System.in);

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (Exception e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
        public static String checkInputId() {
        String  a="";
        while (true) {
            try {
                a=in.nextLine();
                Pattern p=Pattern.compile("^[0-9]+$");
                if(p.matcher(a).find()){
                    return a;
                }
             
            } catch (Exception e) {
                System.err.println("Invalid Id!");
                System.out.println(" Enter again:");
            }
        }
        
    }
    public static String checkInputString() {
        String a="";
        while (true) {
            try {
                a=in.nextLine();
                 if (a != "") {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Invalid String!");
                System.out.println(" Enter again:");
            }
        }
        return a;
    }
    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            }
            if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }

    //check user input u / d
    public static boolean checkInputUD() {
        //loop until user input correct
        while (true) {
            String result = checkInputString();
            //return true if user input u/U
            if (result.equalsIgnoreCase("U")) {
                return true;
            }
            //return false if user input d/D
            if (result.equalsIgnoreCase("D")) {
                return false;
            }
            System.err.println("Please input u/U or d/D.");
            System.out.print("Enter again: ");
        }
    }

    //check user input course
    public static String checkInputCourse() {
        //loop until user input correct
        while (true) {
            String result = checkInputString();
            //check input course in java/ .net/ c/c++
            if (result.equalsIgnoreCase("java")
                    || result.equalsIgnoreCase(".net")
                    || result.equalsIgnoreCase("c/c++")) {
                return result;
            }
            System.err.println("There are only three courses: Java, .Net, C/C++");
            System.out.print("Enter again: ");
        }
    }

    //check student exist
    public static boolean checkStudentExist(ArrayList<Student> ls, String id,
            String studentName, String semester, String courseName) {
        int size = ls.size();
        for (Student student : ls) {
            if (id.equalsIgnoreCase(student.getId())
                    && studentName.equalsIgnoreCase(student.getStudentName())
                    && semester.equalsIgnoreCase(student.getSemester())
                    && courseName.equalsIgnoreCase(student.getCourseName())) {
                return false;
            }
        }
        return true;
    }

    //check report exist
    public static boolean checkReportExist(ArrayList<Report> lr, String name,
            String course, int total) {
        for (Report report : lr) {
            if (name.equalsIgnoreCase(report.getStudentName())
                    && course.equalsIgnoreCase(report.getCourseName())
                    && total == report.getTotalCourse()) {
                return false;
            }
        }
        return true;
    }

    //check id and exist
    public static boolean checkIdExist(ArrayList<Student> ls, String id ) {
        for (Student student : ls) {
            if (id.equalsIgnoreCase(student.getId())
                    ){
                     
                return false;
            }
        }
        return true;
    }
}
