# Android Stubs

A stub is a piece of software replacing some functionality. In this
case we have some, actually a very limited, replacement classes for
Android. With them you can compile and execute your classes locally.

# Using Android Stubs

Download the latest release, put it in your CLASSPATH and start hacking :)

## Example usage


### Class (used in your Android app) to execute locally

Lets say you have a domain class for students, ```Student```. The class uses Android's Log api and therefore you can't compile and execute test locally... until now. Using Android Stubs you compile and execute some classes locally.

Here's the domain class , ```Student```:

~~~
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
~~~

### Test class

Of course you want to test your doman class, so you've written some tests

~~~
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
~~~

### Downloading android-stubs

Go to (Android Stubbs)[https://github.com/progund/android-stubs] and click releases. Aim for the latest jar file (of the latest release) and download it. We download using ```curl``` so:

~~~
curl -LJO https://github.com/progund/android-stubs/releases/download/01/android-stubs-0.1.91.jar
~~~

### Compile

Compile as normal but make sure to add ```android-stubs-0.1.91.jar``` to your CLASSPATH:

~~~
$ javac -cp .:android-stubs-0.1.91.jar se/juneday/domain/Student.java se/juneday/domain/test/StudentTest.java
~~~

### Execute tests

Execute your test as normal but make sure to add ```android-stubs-0.1.91.jar``` to your CLASSPATH:

~~~
$ java -ea  -cp .:android-stubs-0.1.91.jar se.juneday.domain.test.StudentTest 
DEBUG: Student | Student(Ozzy, prince@darknezz.com, 1948-12-03)
Verifying name: OK
Verifying email: OK
Verifying age: DEBUG: Student | age() - calcuting age for: Ozzy
OK
DEBUG: Student | Student(Lemmy, lemmy@darknezz.com, 1945-12-24)
Verifying name: OK
Verifying email: OK
Verifying age: DEBUG: Student | age() - calcuting age for: Lemmy
OK
~~~

### Compile and execute test in one command line

~~~
$ javac -cp .:android-stubs-0.1.91.jar se/juneday/domain/Student.java se/juneday/domain/test/StudentTest.java && java -ea  -cp .:android-stubs-0.1.91.jar se.juneday.domain.test.StudentTest 
DEBUG: Student | Student(Ozzy, prince@darknezz.com, 1948-12-03)
Verifying name: OK
Verifying email: OK
Verifying age: DEBUG: Student | age() - calcuting age for: Ozzy
OK
DEBUG: Student | Student(Lemmy, lemmy@darknezz.com, 1945-12-24)
Verifying name: OK
Verifying email: OK
Verifying age: DEBUG: Student | age() - calcuting age for: Lemmy
OK
~~~

# Contributing 

You're more than welcome to contribute. Contact us via: ```android-devel _-AT-_ juneday.se```
