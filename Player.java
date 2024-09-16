public class Player {
    private String name;
    private int age;
    private String role;

    public Player(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRole() {
        return role;
    }

    public void displayPlayerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
    }
}
