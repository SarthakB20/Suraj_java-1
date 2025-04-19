import java.util.*;

class University {
    String name;
    String address;
    String estYear;
    String dean;
    int colleges;
    int code;
    ArrayList<College> listColleges = new ArrayList<>();

    University(String name, String address, String estYear, 
        String dean, int colleges, int code) {
        this.name = name;
        this.address = address;
        this.estYear = estYear;
        this.dean = dean;
        this.colleges = colleges;
        this.code = code;
    }

    public void displayUniversity() {
        System.out.println("University Details");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Established Year: " + this.estYear);
        System.out.println("Colleges Affiliated: " + this.colleges);
        System.out.println("University Code: " + this.code);
    }

    public void addCollege(String name, String address, String
     principal, int students, int staffs, String grade, int code, int departments)
      {
        College college = new College(name, address, principal, students, staffs,
                                       grade, code, departments);
        listColleges.add(college);
    }
}

class College {
    String name;
    String address;
    String principal;
    int students;
    int staffs;
    String grade;
    int code;
    int departments;
    ArrayList<Department> listDepartment = new ArrayList<>();

    College(String name, String address, String principal, int students,
                int staffs, String grade, int code, int departments) {
        this.name = name;
        this.address = address;
        this.principal = principal;
        this.students = students;
        this.staffs = staffs;
        this.grade = grade;
        this.code = code;
        this.departments = departments;
    }

    public void displayCollege() {
        System.out.println("College Details");
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.println("Number of Students: " + this.students);
        System.out.println("Staff Members: " + this.staffs);
        System.out.println("Grade: " + this.grade);
        System.out.println("Code: " + this.code);
        System.out.println("Number of Departments: " + this.departments);
    }

    public void addDepartment(String name, String hod, String staff, int students) {
        Department department = new Department(name, hod, staff, students);
        listDepartment.add(department);
    }
}

class Department {
    String name;
    String hod;
    String staff;
    int students;

    Department(String name, String hod, String staff, int students) {
        this.name = name;
        this.hod = hod;
        this.staff = staff;
        this.students = students;
    }

    public void displayDepartment() {
        System.out.println("Department Details");
        System.out.println("Name: " + this.name);
        System.out.println("HOD: " + this.hod);
        System.out.println("Staff Members: " + this.staff);
        System.out.println("Number of Students: " + this.students);
    }
}

public class AggregationDriver {
    public static void main(String[] args) {
        University uni = new University("SPPU", "Ganeshkhind, Pune", 
            "10th February, 1949", "Dr. Parag Kalkar", 919, 1234);
        uni.displayUniversity();

        uni.addCollege("MMCOE", "Karve Nagar", "Dr. V. N. Gohokar", 3000, 300, "A++", 4045, 6);
        uni.addCollege("PBCOE", "Nagpur", "Dr. V. N. Gohokar", 3000, 300, "A++", 4045, 6);
        uni.addCollege("Sinhagad", "Lonavala", "Dr. V. N. Gohokar", 3000, 300, "A++", 4045, 6);
        uni.addCollege("DYPATIL", "Lohegaon", "Dr. V. N. Gohokar", 3000, 300, "A++", 4045, 6);

        System.out.println();

        for (College college : uni.listColleges) {
            college.displayCollege();
            System.out.println();
        }

        String collegeName = "MMCOE";
        for (College college : uni.listColleges) {
            if (collegeName.equals(college.name)) {
                college.addDepartment("Computer Science", "Kalpana", "Rahul", 500);
                college.addDepartment("IT", "Kalpana", "Suresh", 500);
                college.addDepartment("AI&DS", "Kalpana", "Sneha", 500);

                for (Department dept : college.listDepartment) {
                    dept.displayDepartment();
                    System.out.println();
                }
            }
        }
    }
}
