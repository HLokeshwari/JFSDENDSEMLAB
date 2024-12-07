package com.klef.jfsd.exam.Repository;
import com.klef.jfsd.exam.Model.Comment;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Repository

public class CommentsRepository
{
	    private static final String API_URL = "https://jsonplaceholder.typicode.com/comments";

	    public List<Comment> getCommentsFromAPI() {
	        RestTemplate restTemplate = new RestTemplate();
	        Comment[] comments = restTemplate.getForObject(API_URL, Comment[].class);
	        return Arrays.asList(comments);
	    }


}
