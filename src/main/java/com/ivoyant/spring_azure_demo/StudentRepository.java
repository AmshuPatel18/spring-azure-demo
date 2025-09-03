package com.ivoyant.spring_azure_demo;

import com.ivoyant.spring_azure_demo.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
