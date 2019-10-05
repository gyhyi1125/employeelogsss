package com.example.employeelogs.controller;

import com.example.employeelogs.dao.LogsMapper;
import com.example.employeelogs.domain.entity.Logs;
import com.example.employeelogs.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class LogsController {
    @Resource
    private LogsService logsService;

    @GetMapping("/test")
    public String test(){
        return "Success";
    }
    @GetMapping("/insetLog")
    public int insetLog(@RequestParam String userName,@RequestParam String project,@RequestParam String log){
        Date date=new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        Logs logs=new Logs();
        logs.setDatetime(sdf.format(date));
        logs.setProject(project);
        logs.setLog(log);
        logs.setUsername(userName);
        return logsService.insertLogs(logs);
    }
    @GetMapping("/selectAllLogs")
    public List<Logs> selectAllLogs(){
       return logsService.selectAllLogs();
    }
    @GetMapping("/delLog")
    public int delLog(@RequestParam String id){
        return logsService.deleteLogs(id);
    }
    @GetMapping("/updateLog")
    public int updateLog(@RequestParam int id,@RequestParam String log){
        Logs logs=new Logs();
        logs.setId(id);
        logs.setLog(log);
        return logsService.updateLogs(logs);
    }

}
