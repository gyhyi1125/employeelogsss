package com.example.employeelogs.service.Impl;

import com.example.employeelogs.dao.LogsMapper;
import com.example.employeelogs.domain.entity.Logs;
import com.example.employeelogs.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LogsServiceImpl implements LogsService {
    @Resource
    LogsMapper logsMapper;
    @Override
    public List<Logs> selectAllLogs() {
        return logsMapper.selectAll();
    }

    @Override
    public int insertLogs(Logs logs) {
        return logsMapper.insertSelective(logs);
    }

    @Override
    public int deleteLogs(String id) {
        return logsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateLogs(Logs logs) {
        return logsMapper.updateByPrimaryKeySelective(logs);
    }
}
