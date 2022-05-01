package Mafia.StudentManager.repository;

import Mafia.StudentManager.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    /*@Override
    List<Student> findAll();
    Optional<Student> findById(long id);
*/
}


