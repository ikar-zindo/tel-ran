package de.telran.g_280323_m_be_shop._3service.jpa;

import de.telran.g_280323_m_be_shop._1domain.entity.jpa.Task;
import de.telran.g_280323_m_be_shop._2repository.jpa.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

   private TaskRepository repository;

   public TaskService(TaskRepository repository) {
      this.repository = repository;
   }

   public Task createTask(String description) {
      return repository.save(new Task(description));
   }
}
