package com.SpringTakeHome.SpringTakeHome.Service;

import com.SpringTakeHome.SpringTakeHome.Entity.Task;
import com.SpringTakeHome.SpringTakeHome.Repository.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepo taskRepo;

    public Task createTask(Task task) {
        return taskRepo.save(task);
    }

    public List<Task> getAllTask(){
        return taskRepo.findAll();
    }

    public Task getTaskById(Long taskId){
        return taskRepo.findById(taskId).orElse(null);
    }

    public Task updateTask(Long id, Task task) {
        Task updatedTask = taskRepo.findById(id).orElse(null);

        if (updatedTask != null) {
            updatedTask.setCompleted(task.getCompleted());
            updatedTask.setTitle(task.getTitle());
            updatedTask.setDescription(task.getDescription());
            taskRepo.save(updatedTask);
        }
        return null;
    }

    public void deleteTask(Long id){
        taskRepo.deleteById(id);
    }


}
