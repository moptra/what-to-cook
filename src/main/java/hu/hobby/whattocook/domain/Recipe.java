package hu.hobby.whattocook.domain;



import hu.hobby.whattocook.domain.enums.RecipeDifficulty;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id")
    private Long recipeId;

    @Column(unique = true, name = "recipe_title")
    private String recipeTitle;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private CustomUser recipeAuthor;

    @Column(name = "recipe_text", columnDefinition = "TEXT")
    private String recipeText;

    @Column(name = "recipe_register_date")
    private LocalDateTime registerDate;

    @OneToMany(mappedBy = "recipe")
    private List<Comment> comments;

    @ElementCollection
    @CollectionTable(name = "tags")
    private List<String> tags;

    @Enumerated(EnumType.STRING)
    @Column(name = "difficulty")
    private RecipeDifficulty difficulty;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    public Recipe() {
    }

    public Long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public CustomUser getRecipeAuthor() {
        return recipeAuthor;
    }

    public void setRecipeAuthor(CustomUser recipeAuthor) {
        this.recipeAuthor = recipeAuthor;
    }

    public String getRecipeText() {
        return recipeText;
    }

    public void setRecipeText(String recipeDescription) {
        this.recipeText = recipeDescription;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public RecipeDifficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(RecipeDifficulty difficulty) {
        this.difficulty = difficulty;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }
}
