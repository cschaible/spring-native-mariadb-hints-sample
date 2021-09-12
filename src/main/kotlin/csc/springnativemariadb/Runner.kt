package csc.springnativemariadb

import csc.springnativemariadb.model.Task
import csc.springnativemariadb.repository.TaskRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import org.springframework.transaction.annotation.Transactional

@Component
class Runner(private val taskRepository: TaskRepository) : ApplicationRunner {

  @Transactional
  override fun run(args: ApplicationArguments?) {
    val task = taskRepository.save(Task("task1"))

    val foundTask = taskRepository.findById(task.id!!)
    println("Task with id: ${foundTask.get().id}")
  }
}
