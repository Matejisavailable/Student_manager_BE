package Mafia.StudentManager.Service;
import Mafia.StudentManager.DTO.StudentDTO;
import Mafia.StudentManager.Model.Fakulta;
import Mafia.StudentManager.Model.Katedra;
import Mafia.StudentManager.Model.Odbor;
import Mafia.StudentManager.Model.Student;
import Mafia.StudentManager.Repository.FakultaRepository;
import Mafia.StudentManager.Repository.KatedraRepository;
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
    private final FakultaRepository fakultaRepository;
    private final KatedraRepository katedraRepository;

    public StudentService(StudentRepository studentRepository, OdborRepository odborRepository,KatedraRepository katedraRepository,FakultaRepository fakultaRepository) {
        this.studentRepository = studentRepository;
        this.odborRepository = odborRepository;
        this.fakultaRepository = fakultaRepository;
        this.katedraRepository = katedraRepository;
    }
    private static StudentDTO mapStudentDTO(Student student){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setMeno(student.getMeno());
        studentDTO.setPriezvisko(student.getPriezvisko());
        studentDTO.setMail(student.getMail());
        studentDTO.setMesto(student.getMesto());
        studentDTO.setRocnik(student.getRocnik());
        studentDTO.setOdborNazov(student.getOdbor().getNazov());
        studentDTO.setFakultaNazov(student.getFakulta().getNazov());
        studentDTO.setKatedraNazov(student.getKatedra().getNazov());
        return studentDTO;
    }
@Transactional
    public Long addStudent(StudentDTO studentDTO){
        Student student = new Student();
        student.setMeno(studentDTO.getMeno());
        student.setPriezvisko(studentDTO.getPriezvisko());
        student.setMesto(studentDTO.getMesto());
        student.setRocnik(studentDTO.getRocnik());
        student.setOdbor(findOdborId(studentDTO.getOdbor()));
        student.setFakulta(findFakulta(studentDTO.getFakultanaz()));
        student.setKatedra(findKatedra(studentDTO.getKatedranaz()));
        student = this.studentRepository.save(student);
        student.setMail((studentDTO.getMeno())+"."+(studentDTO.getPriezvisko())+(student.getId())+"@skola.com");
        this.studentRepository.save(student);
        return student.getId();
    }

    @Transactional
    public Odbor findOdborId(Long id) {
        return odborRepository.getById(id);
    }
    @Transactional
    public Fakulta findFakulta(Long id){
        return fakultaRepository.getById(id);
    }
    @Transactional
    public Katedra findKatedra(Long id){
        return katedraRepository.getById(id);
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
