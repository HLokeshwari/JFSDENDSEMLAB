package com.klef.jfsd.exam.Manager;

import com.klef.jfsd.exam.Model.Comment;
import com.klef.jfsd.exam.Repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsManager
{

	    @Autowired
	    private CommentsRepository commentsRepository;

	    public List<Comment> fetchComments() {
	        return commentsRepository.getCommentsFromAPI();
	    }


}
