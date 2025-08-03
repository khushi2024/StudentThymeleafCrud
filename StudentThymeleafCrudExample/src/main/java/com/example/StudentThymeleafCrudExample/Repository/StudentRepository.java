package com.example.StudentThymeleafCrudExample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.StudentThymeleafCrudExample.Entity.Student;

import jakarta.transaction.Transactional;

import java.util.List;


@Repository
@Transactional
public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query("update Student s set s.result = :status where id = :id")
    @Modifying
    void updateResultStatus(long id, boolean status);

    List<Student> findByNameContainingIgnoreCase(String keyword);
}
