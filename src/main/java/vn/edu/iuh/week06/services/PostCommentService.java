package vn.edu.iuh.week06.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.week06.models.PostComment;
import vn.edu.iuh.week06.repositories.PostCommentRepository;

import java.util.List;

@Service
public class PostCommentService {
    @Autowired
    private PostCommentRepository postCommentRepository;

    public void save(PostComment comment){
        postCommentRepository.save(comment);
    }

    public List<PostComment>findPostCommentsByPostId(long id){
        return postCommentRepository.findPostCommentsByPostId(id);
    }
}
