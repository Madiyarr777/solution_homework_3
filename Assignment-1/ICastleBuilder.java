public interface ICastleBuilder {
    ICastleBuilder setCastleName(String name);
    ICastleBuilder addChamber(Chamber chamber);
    ICastleBuilder addCharacter(GameCharacter character);
    Castle build();
}