import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> ls = new ArrayList<>();
        Validation validation = new Validation();
        ReportManagement rp=new ReportManagement();
        ls.add(new Student("1", "Pham Minh Anh", "Spring", "java"));
        ls.add(new Student("2", "Tran Anh Nam", "Summer", ".net"));
        ls.add(new Student("3", "Nguyen Minh Long", "Spring", "c/c++"));
        ls.add(new Student("4", "Nguyen Minh Long", "winter", "c/c++"));
        int count = 5;
        while (true) {
            Manager.menu();
            int choice = validation.checkInputIntLimit(1, 5);
            switch (choice) {
                case 1:
                    Manager.createStudent(count, ls);
                    break;
                case 2:
                    Manager.findAndSort(ls);
                    break;
                case 3:
                    Manager.updateOrDelete(count, ls);
                    break;
                case 4:
                  rp.displayReport(ls);
                    break;
                case 5:
                    return;
            }

        }
    }

}
