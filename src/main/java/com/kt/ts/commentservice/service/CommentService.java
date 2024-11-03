package com.kt.ts.commentservice.service;

import com.kt.ts.commentservice.model.Comment;
import com.kt.ts.commentservice.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Comment createComment(@RequestBody Comment comment) {
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentsByTicketId(@PathVariable String ticketId) {
        return commentRepository.findByTicketId(ticketId);
    }
}
