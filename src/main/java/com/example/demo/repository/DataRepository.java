package com.example.demo.repository;

import com.example.demo.repository.dao.DataObject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<DataObject, Long> {
}
