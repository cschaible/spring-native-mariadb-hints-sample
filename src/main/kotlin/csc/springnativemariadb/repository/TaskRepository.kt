package csc.springnativemariadb.repository

import csc.springnativemariadb.model.Task
import org.springframework.data.jpa.repository.JpaRepository

interface TaskRepository : JpaRepository<Task, Long>
