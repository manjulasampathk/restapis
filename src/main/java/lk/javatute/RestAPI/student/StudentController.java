package lk.javatute.RestAPI.student;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private StudentService studentService;

    /**
     * Autowired student service
     *
     * @param studentService
     */
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "/students")
    public List<Student> getAllStudent() {
        return studentService.getAll();
    }

    @PostMapping(value = "/students")
    public void addStudent(@RequestBody Student student) {
        studentService.save(student);
    }

    @PutMapping(value = "/students")
    public void modifyStudent(@RequestBody Student student) {
        studentService.update(student);
    }

    @DeleteMapping(value = "/students/{studentId}")
    public void deleteStudent(@PathVariable("studentId") String studentId) {
        studentService.delete(studentId);
    }
}
