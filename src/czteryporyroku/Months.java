package czteryporyroku;

public enum Months {
    JANUARY("styczeń"),
    FEBRUARY("luty"),
    MARCH("marzec"),
    APRIL("kwiecień"),
    MAY("maj"),
    JUNE("czerwiec"),
    JULY("lipiec"),
    AUGUST("sierpień"),
    SEPTEMBER("wrzesień"),
    OCTOBER("październik"),
    NOVEMBER("listopad"),
    DECEMBER("grudzień");

    private final String name;

    Months(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
