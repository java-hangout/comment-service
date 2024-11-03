package com.kt.ts.commentservice.controller;

import com.kt.ts.commentservice.model.Comment;
import com.kt.ts.commentservice.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/create")
    public Comment createComment(@RequestBody Comment comment) {
        return commentService.createComment(comment);
    }

    @GetMapping("/ticket/{ticketId}")
    public List<Comment> getCommentsByTicketId(@PathVariable String ticketId) {
        return commentService.getCommentsByTicketId(ticketId);
    }
}
