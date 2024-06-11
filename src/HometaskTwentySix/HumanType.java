package HometaskTwentySix;

public enum HumanType {
    USER("Пользователь"),
    ADMIN("Админтстратор");

private String name;

    HumanType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
