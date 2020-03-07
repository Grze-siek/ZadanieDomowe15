package czteryporyroku;

public enum Season {

    SPRING("wiosna", new Months[]{Months.MARCH, Months.APRIL, Months.MAY}),
    SUMMER("lato", new Months[]{Months.JUNE, Months.JULY, Months.AUGUST}),
    AUTUMN("jesień", new Months[]{Months.SEPTEMBER, Months.OCTOBER, Months.NOVEMBER}),
    WINTER("zima", new Months[]{Months.DECEMBER, Months.JANUARY, Months.FEBRUARY}),
    ;
    private final String name;
    private final Months[] seasonMonths;

    Season(String name, Months[] seasonMonths) {
        this.name = name;
        this.seasonMonths = seasonMonths;
    }
    public String getName() {
        return name;
    }

    public Months[] getSeasonMonths() {
        return seasonMonths;
    }

    public static Season fromDescription(String description) throws WrongDescriptionException{
        Season[] seasons = values();
        for (Season season : seasons) {
            if (season.getName().equalsIgnoreCase(description))
                return season;
        }
        throw new WrongDescriptionException("Nie znaleziono pory roku. Wprowadz ją jeszcze raz.");
    }

}
