package Mafia.StudentManager.Exceptions;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String s) {
        super(s);
    }
}
