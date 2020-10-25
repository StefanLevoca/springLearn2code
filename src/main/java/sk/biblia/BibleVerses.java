package sk.biblia;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BibleVerses {
    private List<String> verses = null;

    public BibleVerses() {
        this.verses = Arrays.asList(
                "Ježiš Kristus ten istý včera i dnes i naveky. Židom 13/8",
                "Choďte po celom svete, kážte evanjelium všetkému stvoreniu. Mk 16/15"
        );
    }

    public String getVers(){
        Random random = new Random();
        int i = random.nextInt(verses.size());
        return verses.get(i);
    }

    public static void main(String[] args) {
        BibleVerses verses = new BibleVerses();
        System.out.println(verses.getVers());
    }
}
