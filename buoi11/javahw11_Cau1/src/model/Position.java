package model;

public enum Position {

    GK("Thu mon"),
    DF("Hau ve"),
    MF("Tien ve"),
    FW("Tien dao");

    private String value;

    Position(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
