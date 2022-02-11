package ru.danilsibgatullin.interfaces;

import ru.danilsibgatullin.models.Student;

import java.util.List;
import java.util.Optional;

public interface StudentInterface extends DataBaseInterface {
    List<Student> getAllStudent();
    Optional<Student> findById(Long id);
    void save(Student student);
}
