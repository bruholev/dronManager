package kg.Robotics.repository;

import kg.Robotics.dao.DroneResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DroneRepository  extends JpaRepository<DroneResult,Long> {
}
