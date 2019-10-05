package com.example.employeelogs.service;

import com.example.employeelogs.domain.entity.Comments;
import com.example.employeelogs.domain.entity.Logs;

import java.util.List;

public interface CommentsService {
    Comments  selectBykey(int id);
    int insertComments(Comments comments);

}
