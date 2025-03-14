public class CastleCombinedDemo {
    public static void main(String[] args) {
        Chamber template = new Chamber("Standard room", "Empty stone room");
        BasicCastleBuilder builder = (BasicCastleBuilder) new BasicCastleBuilder()
                .setCastleName("Fortress of Shadows");


        for (int i = 1; i <= 5; i++) {
            Chamber clone = template.copyEntity();
            clone.setName("Room #" + i);
            builder.addChamber(clone);
        }

        Castle castle = builder.build();
        System.out.println("A castle has been created with " + castle.getChambers().size() + "identical rooms");
    }
}