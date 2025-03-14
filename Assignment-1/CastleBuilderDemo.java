public class CastleBuilderDemo {
    public static void main(String[] args) {
        Chamber throneRoom = new Chamber("The Throne Room", "The Big room with the Golden Throne");
        GameCharacter king = new GameCharacter("King Arthur", "The Ruler of the Castle");

        Castle castle = new BasicCastleBuilder()
                .setCastleName("Camelot")
                .addChamber(throneRoom)
                .addCharacter(king)
                .build();

        System.out.println(" Lock: " + castle.getName() + " ");
        System.out.println("Rooms:");
        for (Chamber room : castle.getChambers()) {
            System.out.println(" - " + room.getName() + ": " + room.getDescription());
        }
        System.out.println("Characters:");
        for (GameCharacter npc : castle.getCharacters()) {
            System.out.println(" - " + npc.getName() + ": " + npc.getDescription());
        }
    }
}