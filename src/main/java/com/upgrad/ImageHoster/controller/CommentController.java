package com.upgrad.ImageHoster.controller;

import com.upgrad.ImageHoster.model.Comment;
import com.upgrad.ImageHoster.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/image/{title}/comments/create", method = RequestMethod.POST)
    public String createComment(HttpSession session, @RequestParam("commentText") String commentText,
                                String title) {
        if (commentText != null) {
            Comment comment = new Comment();
            comment.setCommentText(commentText);
            commentService.createComment(comment);
        }

        return "/";

    }
}
