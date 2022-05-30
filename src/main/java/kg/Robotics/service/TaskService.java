package kg.Robotics.service;


import kg.Robotics.dao.*;
import org.springframework.stereotype.Service;
@Service
public class TaskService {
WebService webService=new WebService();
 public String request(String message){
     return webService.requestTask(message);
 }
}