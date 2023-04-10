package com.example.tp2.main.repositories;

import com.example.tp2.main.entities.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

@Transactional
public interface StudentRepository extends JpaRepository<Student, Integer> {
  List<Student> findByRegistrationNumber(String registrationNumber);
    List<Student> findByStillActive(Boolean stillActive);
    List<Student> findByBirthday(Date birthday);
    List<Student> findByFullName(String fullName);
    List<Student> findByLastConnection(Date lastConnection);

  List<Student> deleteByFullName(String ls);
  long deleteByStillActive(Boolean stillActive);

  List<Student> findByFullNameAndStillActiveIsTrue(String fullName);
  List<Student> findByRegistrationNumberLike(String registrationNumber);
  List<Student> findByRegistrationNumberLikeAndFullNameLike(String registrationNumber, String fullName);
  List<Student> findByIdIsLessThan(Integer id);
  List<Student> findByIdIsLessThanEqual(Integer id);
  List<Student> deleteByFullNameAndStillActiveIsTrue(String fullName);
}
