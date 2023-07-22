package hu.hobby.whattocook.domain.enums;

public enum UserRole {
    ROLE_READER_WRITER("ÍRÓ-OLVASÓ"),
    ROLE_ADMIN("ADMIN");
    private final String role;

    UserRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
