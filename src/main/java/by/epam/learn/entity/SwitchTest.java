package by.epam.learn.entity;

public class SwitchTest {
    public int defineLevel (String role) {
        return switch (role) {
            case "guest" -> 0;
            case "client" -> 1;
            case "moderator" -> 2;
            case "admin" -> 3;
            default -> {
                System.out.println("non-authentic role = " + role);
                yield -1;
            }
        };
    }
}
