package kg.Robotics.controller;

import kg.Robotics.dao.*;
import kg.Robotics.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;



@Controller
public class TaskController {
    @Autowired
    TaskService taskService;
    //  отправляем запрос
    @GetMapping("/{message}")
    public String shoot(@PathVariable("message") String message, Model model) {

       model.addAttribute("record",taskService.request(message));
        return "Shoot";
    }

}