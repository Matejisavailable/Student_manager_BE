package Mafia.StudentManager.Controller;
import Mafia.StudentManager.Model.Student;
import Mafia.StudentManager.Service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/everyone")
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = studentService.findStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id){
        Student student = studentService.findStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        Student student1 = studentService.addStudent(student);
        return new ResponseEntity<>(student1,HttpStatus.CREATED);
    }
    @PutMapping("/change")
    public ResponseEntity<Student> changeStudent(@RequestBody Student student){
        Student changedstudent = studentService.addStudent(student);     //TODO DTO treba dorobiť
        return new ResponseEntity<>(changedstudent,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
