/**
 * Example class - not to show OO principles.... just there serving as
 * an example of how to use Android Stubs
 */
package se.juneday.domain;

import android.util.Log;

import java.time.LocalDate;
import java.time.Period;

public class Student {

  private final static String LOG_TAG = Student.class.getSimpleName();
  
  // Given name + family name
  private String name;
  private String email;
  
  private LocalDate birth; // birth date - ignoring timezone 

  public Student(String name, String email, LocalDate birth) {
    Log.d(LOG_TAG, "Student(" + name + ", " + email + ", " + birth + ")");
    this.name = name;
    this.email = email;
    this.birth = birth;
  }
  
  public Student(String name, String email, int year, int month, int day) {
    this(name, email, LocalDate.of(year, month, day));
  }
  
  public String name() {
    return name;
  }
  
  public String email() {
    return email;
  }

  public int age() {
    Log.d(LOG_TAG, "age() - calcuting age for: " + name());
    return Period.between(birth, LocalDate.now()).getYears();
  }

}
