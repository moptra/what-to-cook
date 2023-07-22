package hu.hobby.whattocook.domain.enums;

public enum RecipeDifficulty {
    DIFFICULTY_EASY("KÖNNYŰ"),
    DIFFICULTY_MEDIUM("KÖZEPES"),
    DIFFICULTY_HARD("NEHÉZ");
    private final String difficulty;

    RecipeDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getDifficulty() {
        return difficulty;
    }
}
