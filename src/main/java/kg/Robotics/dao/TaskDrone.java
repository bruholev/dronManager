package kg.Robotics.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TaskDrone {

@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
   private String taskDescription;
   private String   taskAction;
   private Integer modeId;
   private String modeDescription;
   private String mode;

    public TaskDrone() {    }

    public TaskDrone(Long id, String taskDescription, String taskAction, Integer modeId, String modeDescription, String mode) {
        this.id = id;
        this.taskDescription = taskDescription;
        this.taskAction = taskAction;
        this.modeId = modeId;
        this.modeDescription = modeDescription;
        this.mode = mode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskAction() {
        return taskAction;
    }

    public void setTaskAction(String taskAction) {
        this.taskAction = taskAction;
    }

    public Integer getModeId() {
        return modeId;
    }

    public void setModeId(Integer modeId) {
        this.modeId = modeId;
    }

    public String getModeDescription() {
        return modeDescription;
    }

    public void setModeDescription(String modeDescription) {
        this.modeDescription = modeDescription;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
