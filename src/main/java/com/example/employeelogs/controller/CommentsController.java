package com.example.employeelogs.controller;

import com.example.employeelogs.domain.entity.Comments;
import com.example.employeelogs.service.CommentsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
public class CommentsController {
    @Resource
    CommentsService commentsService;
    @GetMapping("/insetComments")
    public int insetComments(@RequestParam int id, @RequestParam String critic, @RequestParam String Comment){
        Comments comments=new Comments();
        comments.setId(id);
        comments.setCritic(critic);
        comments.setComment(Comment);
        return commentsService.insertComments(comments);
    }
    @GetMapping("/selectCommentsBykey")
    public Comments selectCommentsBykey(@RequestParam int id){

        return commentsService.selectBykey(id);
    }
}
