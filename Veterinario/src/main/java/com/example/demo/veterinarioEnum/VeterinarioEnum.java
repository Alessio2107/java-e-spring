package com.example.demo.veterinarioEnum;

public enum VeterinarioEnum {
    PESCI("Pesci"),
    RETTILI("Rettili"),
    ANFIBI("Anfibi"),
    MAMMIFERI("Mammiferi"),
    UCCELLI("Uccelli");

    private final String value;

    VeterinarioEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
