package ru.danilsibgatullin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.danilsibgatullin.models.Student;


public interface StudentRepository extends JpaRepository<Student,Long> {
}
