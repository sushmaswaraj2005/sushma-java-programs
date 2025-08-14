// Parent class: College
class College {
    public String collegeName;
    public String location;

    // Constructor
    public College(String collegeName, String location) {
        this.collegeName = collegeName;
        this.location = location;
    }

    // Getter for collegeName
    public String getCollegeName() {
        return collegeName;
    }

    // Setter for collegeName
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    // Getter for location
    public String getLocation() {
        return location;
    }

    // Setter for location
    public void setLocation(String location) {
        this.location = location;
    }

    public void displayCollegeInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Location: " + location);
    }
}

// Child class: School (inherits from College)
class School extends College {
    private String schoolName;
    private String department;

    // Constructor
    public School(String collegeName, String location, String schoolName, String department) {
        super(collegeName, location); // Call parent class constructor
        this.schoolName = schoolName;
        this.department = department;
    }

    // Getter for schoolName
    public String getSchoolName() {
        return schoolName;
    }

    // Setter for schoolName
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }

    public void displaySchoolInfo() {
        super.displayCollegeInfo(); // Call parent method
        System.out.println("School Name: " + schoolName);
        System.out.println("Department: " + department);
    }
}

// Main class to demonstrate the system
class CollegeManagementSystem {
    public static void main(String[] args) {
        // Create a School object
        School engineeringSchool = new School("Tech University", "City Center", "School of Engineering", "Computer Science");

        // Display information using getter methods
        System.out.println("--- School Information ---");
        engineeringSchool.displaySchoolInfo();

        // Modify information using setter methods
        engineeringSchool.setDepartment("Software Engineering");
        System.out.println("\n--- Updated School Information ---");
        engineeringSchool.displaySchoolInfo();

        // Access college-level information through the School object
        System.out.println("\nCollege name from School object: " + engineeringSchool.getCollegeName());
    }
}