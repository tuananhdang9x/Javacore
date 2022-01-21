public enum Gender {
    MALE ("Nam"),
    FEMALE ("Nữ");

    private String name;

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
