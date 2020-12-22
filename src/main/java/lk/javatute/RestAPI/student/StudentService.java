package lk.javatute.RestAPI.student;

import java.util.List;

public interface StudentService {
    void save(Student student);

    List<Student> getAll();

    void update(Student student);

    void delete(String studentId);
}
