
public class Student implements Comparable<Student>{
    private String name;

    public Student(String name) {
        this.name = name;
    }
    // method to comapre the names
    public boolean equals(Student other) {
        if (this.name == other.name) {
            return true;
        }
        else {
            return false;
        }
    }
    // compareTo is a special method of the Comparable class
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }
    // Special method to display the class name
    public String toString() {
        return "Student("+this.name+")";
    }
}

