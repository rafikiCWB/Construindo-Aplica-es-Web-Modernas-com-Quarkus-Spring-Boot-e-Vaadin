package com.example.starter.base.repository;

import com.example.starter.base.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
