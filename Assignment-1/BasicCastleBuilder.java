import java.util.ArrayList;
import java.util.List;

public class BasicCastleBuilder implements ICastleBuilder {
    private String name;
    private List<Chamber> chambers = new ArrayList<>();
    private List<GameCharacter> characters = new ArrayList<>();

    @Override
    public ICastleBuilder setCastleName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public ICastleBuilder addChamber(Chamber chamber) {
        chambers.add(chamber);
        return this;
    }

    @Override
    public ICastleBuilder addCharacter(GameCharacter character) {
        characters.add(character);
        return this;
    }

    @Override
    public Castle build() {
        return new Castle(name, chambers, characters);
    }
}
