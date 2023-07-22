package hu.hobby.whattocook.contorller;

import hu.hobby.whattocook.service.CommentService;
import hu.hobby.whattocook.validators.CommentCommandValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
    private CommentService commentService;
    private CommentCommandValidator commentCommandValidator;

    @Autowired
    public CommentController(CommentService commentService, CommentCommandValidator commentCommandValidator) {
        this.commentService = commentService;
        this.commentCommandValidator = commentCommandValidator;
    }
}
