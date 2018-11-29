package se.juneday.domain.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import se.juneday.domain.Student;

public class StudentTest {

  public static void verifyStudent(Student student, String expName, String expEmail, int expAge) {
    System.out.print("Verifying name: ");
    assert (student.name().equals(expName)) : "Failed, expected \"" + expName + "\", got: " + student.name();
    System.out.println("OK");
    
    System.out.print("Verifying email: ");
    assert (student.email().equals(expEmail)) : "Failed, expected \"" + expEmail + "\", got: " + student.email();
    System.out.println("OK");
    
    System.out.print("Verifying age: ");
    assert (student.age() == expAge ) : "Failed";
    System.out.println("OK");

  }
  
  public static void main(String[] args) {

    Student student = new Student("Ozzy", "prince@darknezz.com", 1948, 12, 03);
    verifyStudent(student, "Ozzy", "prince@darknezz.com", Period.between(LocalDate.of(1948, Month.DECEMBER, 03), LocalDate.now()).getYears());

    student = new Student("Lemmy", "lemmy@darknezz.com", LocalDate.of(1945, Month.DECEMBER, 24));
    verifyStudent(student, "Lemmy", "lemmy@darknezz.com", Period.between(LocalDate.of(1945, Month.DECEMBER, 24), LocalDate.now()).getYears());
  }
  
}

