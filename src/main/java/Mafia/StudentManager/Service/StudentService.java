package Mafia.StudentManager.Service;

import Mafia.StudentManager.DTO.OdborDTO;
import Mafia.StudentManager.DTO.StudentDTO;
import Mafia.StudentManager.Model.Odbor;
import Mafia.StudentManager.Model.Student;
import Mafia.StudentManager.Repository.OdborRepository;
import Mafia.StudentManager.Repository.StudentRepository;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final OdborRepository odborRepository;

    public StudentService(StudentRepository studentRepository, OdborRepository odborRepository) {
        this.studentRepository = studentRepository;
        this.odborRepository = odborRepository;
    }

    private static StudentDTO mapStudentDTO(Student student){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setMeno(student.getMeno());
        studentDTO.setPriezvisko(student.getPriezvisko());
        studentDTO.setMail((student.getMeno())+"."+(student.getPriezvisko())+"@skola.com");
        studentDTO.setMesto(student.getMesto());
        studentDTO.setRocnik(student.getRocnik());
        studentDTO.setOdbor(student.getOdbor().getId());
        return studentDTO;
    }
@Transactional
    public Long addStudent(StudentDTO studentDTO){
        Student student = new Student();
        student.setMeno(studentDTO.getMeno());
        student.setPriezvisko(studentDTO.getPriezvisko());
        student.setMail((studentDTO.getMeno())+"."+(studentDTO.getPriezvisko())+"@skola.com");
        student.setMesto(studentDTO.getMesto());
        student.setRocnik(studentDTO.getRocnik());
        student.setOdbor(findOdborId(studentDTO.getOdbor()));
        this.studentRepository.save(student);
        return student.getId();
    }
    @Transactional
    public Odbor findOdborId(Long id) {
        return odborRepository.getById(id);
    }
@Transactional
    public List<StudentDTO> findStudents(String priezvisko) {
    List<StudentDTO> students = new LinkedList<>();
    for (Student s1 : studentRepository.findAll()) {
        StudentDTO s2 = mapStudentDTO(s1);
        students.add(s2);
    }
    return students;
}
@Transactional
    public StudentDTO findStudentById(Long id){
    for (Student s1 : studentRepository.findAll()) {
            if(s1.getId().equals(id)){
                StudentDTO s2 = mapStudentDTO(s1);
                return s2;
            }
        }
        return null;
    }

    @Transactional
    public void updateStudent(Long id, StudentDTO studentDTO){
        Optional<Student> byId = studentRepository.findById(id);
        if(byId.isPresent()){
            byId.get().setMeno(studentDTO.getMeno());
            byId.get().setPriezvisko(studentDTO.getPriezvisko());
            byId.get().setMail(studentDTO.getMail());
            byId.get().setMesto(studentDTO.getMesto());
            byId.get().setId(studentDTO.getId());
            byId.get().setRocnik(studentDTO.getRocnik());
        }
    }
    @Transactional
    public void deleteStudent(Long id){
        Optional<Student> byId = studentRepository.findById(id);
        if(byId.isPresent()){
            studentRepository.delete(byId.get());
        }
    }
}
