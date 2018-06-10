package com.upgrad.ImageHoster.common;

import com.upgrad.ImageHoster.model.Comment;
import org.hibernate.Session;

public class CommentManager extends SessionManager {

    public Comment createComment(Comment comment) {
        Session session = openSession();
        session.save(comment);
        commitSession(session);
        return comment;
    }
}
