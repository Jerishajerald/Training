package com.example.demo.ifaces;
import com.example.demo.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}