package com.naman.taskflow.repository;

import com.naman.taskflow.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * TaskRepository handles all database operations for the Task entity.
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
