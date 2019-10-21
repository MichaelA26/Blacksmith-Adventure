package com.codeclan.Workeeservice.repositories;

import com.codeclan.Workeeservice.models.Workee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkeeRepository extends JpaRepository<Workee, Long> {
}
