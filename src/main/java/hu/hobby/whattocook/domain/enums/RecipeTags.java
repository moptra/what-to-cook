package hu.hobby.whattocook.domain.enums;

public enum RecipeTags {
    TAG_HEALTHY("EGÉSZSÉGES"),
    TAG_JUNK("JUNK"),
    TAG_PASTA("TÉSZTA"),
    TAG_RICE("RIZS"),
    TAG_BULGUR("BULGUR"),
    TAG_POTATO("BURGONYA"),
    TAG_SOUP("LEVES"),
    TAG_STEW("FŐZELÉK"),
    TAG_VEGA("VEGA"),
    TAG_MEET("HÚS"),
    TAG_SWEET("ÉDES"),
    TAG_SALTY("SÓS"),
    TAG_DESSERT("DESSZERT"),
    TAG_MAINMEAL("FŐÉTKEZÉS"),
    TAG_DINNER("VACSORA"),
    TAG_BREAKFAST("REGGELI"),
    TAG_LIGHT("KÖNNYŰ");

    private final String tag;

    RecipeTags(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }
}
