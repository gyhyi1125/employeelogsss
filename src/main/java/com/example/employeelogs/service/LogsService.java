package com.example.employeelogs.service;

import com.example.employeelogs.domain.entity.Logs;

import java.util.List;

public interface LogsService {
    List<Logs> selectAllLogs();
    int insertLogs(Logs logs);
    int deleteLogs(String id);
    int updateLogs(Logs logs);
}
