package Map.Set.Collection_Work_Set_Navigate;

import java.util.Objects;

public class Student_HashCode {
    String  name;
    int age;

    public Student_HashCode(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student_HashCode student = (Student_HashCode) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
