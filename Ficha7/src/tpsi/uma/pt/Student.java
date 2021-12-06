package tpsi.uma.pt;


import java.util.Objects;

// 4. -> criar classe Student
public class Student implements Comparable<Student>{
    private int number;
    private String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object asd) {
        if (this == asd) return true;
        if (asd == null || getClass() != asd.getClass()) return false;
        Student student = (Student) asd;
        return number == student.number && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    @Override
    public int compareTo(Student asd) {
        return (this.number - asd.number);
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
