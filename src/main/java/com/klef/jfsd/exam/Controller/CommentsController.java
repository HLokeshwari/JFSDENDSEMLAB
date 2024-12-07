package com.klef.jfsd.exam.Controller;
import com.klef.jfsd.exam.Manager.CommentsManager;
import com.klef.jfsd.exam.Model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentsController 
{
	   @Autowired
	    private CommentsManager commentsManager;

	    @GetMapping("/comments")
	    public List<Comment> getAllComments() {
	        return commentsManager.fetchComments();
	    }


}
