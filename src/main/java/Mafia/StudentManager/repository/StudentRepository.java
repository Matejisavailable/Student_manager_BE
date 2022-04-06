package Mafia.StudentManager.repository;

import Mafia.StudentManager.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

   // void deleteStudentById(Long id);   Toto tu vraj netreba
    //Optional<Student> findStudentById(Long id);


}
