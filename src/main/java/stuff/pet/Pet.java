package stuff.pet;

public enum Pet {
    SCHTROUMPH("Schtroumph", 20),
    CHENIPAN("Chenipan", 10),
    GLOBEFISH("Globefish",1),
    VICTORIA_AMAZONICA("Victoria amazonica",15),
    OLD_PIECE_OF_CHEESE("Old piece of cheese",0);

    private final String type;
    private final int damage;

    Pet(String type, int damage) {
        this.type = type;
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }
}