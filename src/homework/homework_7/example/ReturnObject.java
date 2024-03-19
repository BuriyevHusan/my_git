package homework.homework_7.example;

public class ReturnObject {
    private String name;
    private String username;

    public ReturnObject() {
    }

    public ReturnObject(String name, String username) {
        this.name = name;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public ReturnObject getObj(){
        return this;
    }
}
