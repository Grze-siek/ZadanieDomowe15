package czteryporyroku;

import java.util.Arrays;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {

        printSeasons();
        String description = enterSeason();
        printSeasonMonths(description);

    }
    static void printSeasons()
    {
        System.out.println("Podaj nazwę pory roku, która cię interesuje wybierając z:");
        for (Season s: Season.values()) {
            System.out.println(s.getName());
        }
    }
    static String enterSeason()
    {
        Scanner scan = new Scanner(System.in);
        String description = scan.nextLine();
        scan.close();
        return description;
    }
    static void printSeasonMonths (String description)
    {
        try {
            Season season = Season.fromDescription(description);
            System.out.println(season.getName() + " składa się z :" + Arrays.toString(season.getSeasonMonths()));
        } catch (WrongDescriptionException e) {
            System.err.println(e.getMessage());
        }
    }
}
