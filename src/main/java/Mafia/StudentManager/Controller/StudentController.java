package Mafia.StudentManager.Controller;
import Mafia.StudentManager.DTO.OdborDTO;
import Mafia.StudentManager.DTO.StudentDTO;
import Mafia.StudentManager.Service.StudentService;
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
    public List<StudentDTO> getStudents(@RequestParam(required = false) String priezvisko){
        return studentService.findStudents(priezvisko);
    }

    @PostMapping("/add")
    public Long addStudent(@RequestBody StudentDTO student){
        return studentService.addStudent(student);
    }

    @GetMapping("/find/{id}")
    public StudentDTO getStudentById(@PathVariable("id") Long id){
        return studentService.findStudentById(id);
    }

    @PutMapping("/change/{id}")
    public void changeStudent(@PathVariable Long id, @RequestBody StudentDTO student){
        studentService.updateStudent(id,student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable("id") Long id){
        studentService.deleteStudent(id);
    }
}
