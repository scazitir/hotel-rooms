package entities;

public class Guest {
    private String name;
    private String email;

    public Guest(String name, String email){
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(", ");
        sb.append(email);

        return sb.toString();
    }
}
