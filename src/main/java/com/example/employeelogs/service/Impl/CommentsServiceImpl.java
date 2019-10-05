package com.example.employeelogs.service.Impl;

import com.example.employeelogs.dao.CommentsMapper;
import com.example.employeelogs.dao.LogsMapper;
import com.example.employeelogs.domain.entity.Comments;
import com.example.employeelogs.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CommentsServiceImpl implements CommentsService {
    @Resource
    CommentsMapper commentsMapper;
    @Override
    public Comments selectBykey(int id) {
        return commentsMapper.selectByPrimaryKey(id);
    }
    @Override
    public int insertComments(Comments comments) {
        return commentsMapper.insertSelective(comments);
    }
}
