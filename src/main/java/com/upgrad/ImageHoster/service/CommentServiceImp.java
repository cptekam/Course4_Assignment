package com.upgrad.ImageHoster.service;

import com.upgrad.ImageHoster.common.CommentManager;
import com.upgrad.ImageHoster.model.Comment;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImp implements CommentService {

    private CommentManager commentManager;

    public CommentServiceImp() {
        this.commentManager = new CommentManager();
    }

    @Override
    public Comment createComment(Comment comment) {
        return commentManager.createComment(comment);
    }
}
