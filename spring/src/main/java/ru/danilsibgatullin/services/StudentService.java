package ru.danilsibgatullin.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.danilsibgatullin.interfaces.StudentInterface;
import ru.danilsibgatullin.models.Student;
import ru.danilsibgatullin.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements StudentInterface {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);

    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
