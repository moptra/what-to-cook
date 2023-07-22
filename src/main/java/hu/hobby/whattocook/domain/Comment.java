package hu.hobby.whattocook.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long commentId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private CustomUser commentAuthor;

    @Column(name="comment_text")
    private String commentText;

    @Column(name="is_deleted")
    private boolean isDeleted;

    @Column(name="comment_register_date")
    private LocalDateTime dateOfComment;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    public Comment() {
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public CustomUser getCommentAuthor() {
        return commentAuthor;
    }

    public void setCommentAuthor(CustomUser commentAuthor) {
        this.commentAuthor = commentAuthor;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public LocalDateTime getDateOfComment() {
        return dateOfComment;
    }

    public void setDateOfComment(LocalDateTime dateOfComment) {
        this.dateOfComment = dateOfComment;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
