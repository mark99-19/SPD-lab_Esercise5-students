package Student;

import java.util.ArrayList;

public class Student {

    private String name;
    private String surname;
    private String yearOfBirth;
    private Residence residence;
    private ArrayList<Exam> passedExams;

    public Student() {
    }

    public Student(String name, String surname, String yearOfBirth, Residence residence, ArrayList<Exam> passedExams) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.residence = residence;
        this.passedExams = passedExams;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public Residence getResidence() {
        return residence;
    }

    public ArrayList<Exam> getPassedExams() {
        return passedExams;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setResidence(Residence residence) {
        this.residence = residence;
    }

    public void setPassedExams(ArrayList<Exam> passedExams) {
        this.passedExams = passedExams;
    }
}
