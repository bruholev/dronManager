package kg.Robotics.repository;

import kg.Robotics.dao.TaskDrone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskDrone,Long>
{}
