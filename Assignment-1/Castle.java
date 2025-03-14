import java.util.List;

public class Castle {
    private final String name;
    private final List<Chamber> chambers;
    private final List<GameCharacter> characters;

    public Castle(String name, List<Chamber> chambers, List<GameCharacter> characters) {
        this.name = name;
        this.chambers = chambers;
        this.characters = characters;
    }

    // Геттеры
    public String getName() { return name; }
    public List<Chamber> getChambers() { return chambers; }
    public List<GameCharacter> getCharacters() { return characters; }
}
