import java.util.Objects;

public class University {
    private String name;
    private int students;
    private int teachers;
    private double rating;

    public University(String name, int students, int teachers, double rating) {
        this.name = name;
        this.students = students;
        this.teachers = teachers;
        this.rating = rating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, students, teachers, rating);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return students == that.students && teachers == that.teachers && rating == that.rating && name.equals(that.name);
    }

    @Override
    public String toString() {
        return  name + ": " + "How many students = " + students + " , How many teachers = " + teachers + " , What is the average rating = " + rating + ". ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public int getTeachers() {
        return teachers;
    }

    public void setTeachers(int teachers) {
        this.teachers = teachers;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
