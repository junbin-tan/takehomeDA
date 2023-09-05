package com.SpringTakeHome.SpringTakeHome.Repository;

import com.SpringTakeHome.SpringTakeHome.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepo extends JpaRepository<Task, Long> {

}
