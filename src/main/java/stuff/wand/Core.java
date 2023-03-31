package  stuff.wand;

public enum Core {
    PHOENIX_FEATHER("Phoenix Feather"),
    DRAGON_SHELL("Dragon Shell"),
    BIGFOOT_FOOT("Bigfoot 's foot"),
    WING_PLANE("Wing of a Plane"),
    WHITE_POWDER("White Powder"),
    FLOUR_YEAST_SALT_WATER("360 grams of all-purpose flour + 3 grams of salt + 7 grams of active dry yeast + 296 ml of warm water");

    private final String name;

    Core(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}