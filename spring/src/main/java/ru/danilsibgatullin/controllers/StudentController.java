package ru.danilsibgatullin.controllers;

import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.danilsibgatullin.models.Student;
import ru.danilsibgatullin.services.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String listStudent(Model model){
        model.addAttribute("studentList",studentService.getAllStudent());
        return "students";
    }

    @GetMapping("/new")
    public String addNewStudent(Model model){
        return "student_form";
    }

    @GetMapping("/{id}")
    public String editStudent(@PathVariable("id") Long id,Model model) throws NotFoundException {
        model.addAttribute("student",studentService.findById(id).orElseThrow(()-> new NotFoundException("Student not found")));
        return "student_form";
    }

    @PostMapping("/add")
    public String addStudent(Student student){
        studentService.save(student);
        return "redirect:/students";
    }

    @PostMapping("/del/{id}")
    public String deleteStudent(@PathVariable("id") Long id){
        studentService.deleteById(id);
        return "redirect:/students";
    }
}
