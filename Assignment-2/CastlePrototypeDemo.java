public class CastlePrototypeDemo {
    public static void main(String[] args) {
        Chamber original = new Chamber("Archive", "Room with ancient books");
        Chamber copy = original.copyEntity();
        copy.setName("Archive (copy)");

        System.out.println("Original: " + original.getName());
        System.out.println("Copy: " + copy.getName());
    }
}