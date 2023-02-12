public class Id {

    private String name;
    private int id;

    public Id (String name) {
        this.name=name;
        this.id=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
