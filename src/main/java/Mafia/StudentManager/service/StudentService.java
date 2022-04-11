package Mafia.StudentManager.service;

import Mafia.StudentManager.exceptions.StudentNotFoundException;
import Mafia.StudentManager.model.Student;
import Mafia.StudentManager.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public Student addStudent(Student student){
        student.setMail((student.getMeno())+"."+(student.getPriezvisko())+"@skola.com");
        return studentRepository.save(student);
    }
    public List<Student> findStudents(){
        return studentRepository.findAll();
    }
    public Student findStudentById(long id){
        return studentRepository.findById(id).orElseThrow(()->new StudentNotFoundException("Student with id " +id+" was not found"));
    }
    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }
    public void deleteStudent(long id){
        studentRepository.deleteById(id); //Mierna úprava lebo tieto funkcie sú tam automaticky

    }
}
