package Student;

public class Exam {

    private String name;
    private int mark;
    private String dateVerbalization;

    public Exam(String name, int mark, String dateVerbalization)
    {
        this.name = name;
        this.mark = mark;
        this.dateVerbalization = dateVerbalization;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getDateVerbalization() {
        return dateVerbalization;
    }

    public void setDateVerbalization(String dateVerbalization) {
        this.dateVerbalization = dateVerbalization;
    }
}
