public class Chamber implements CopyableEntity {
    private String name;
    private String description;

    public Chamber(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public Chamber copyEntity() {
        return new Chamber(this.name, this.description);
    }


    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public String getDescription() { return description; }
}