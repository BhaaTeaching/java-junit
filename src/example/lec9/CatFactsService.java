package example.lec9;

import java.util.Random;

public class CatFactsService {
    private final Random random;

    public CatFactsService() {
        random = new Random();
    }

    public CatFact getRandomCatFact() {
        CatFact catFact = new CatFact();
        catFact.setStatus("success");
        catFact.setType("random");
        catFact.setDeleted(false);
        catFact.setUser(generateRandomUserName());
        catFact.setText(generateRandomCatFactText());
        catFact.setCreatedAt(generateRandomTimestamp());
        catFact.setUpdatedAt(generateRandomTimestamp());

        return catFact;
    }

    private String generateRandomUserName() {
        String[] userNames = {
                "John Doe",
                "Jane Smith",
                "Michael Johnson",
                "Emily Davis",
                "David Wilson",
                "Sarah Thompson",
                "Robert Anderson"
        };

        int index = random.nextInt(userNames.length);
        return userNames[index];
    }

    private String generateRandomCatFactText() {
        String[] catFacts = {
                "Cats have nine lives.",
                "Cats can see in the dark.",
                "Cats can jump up to six times their body length.",
                "Cats spend around 70% of their lives sleeping.",
                "Cats use their whiskers to determine if they can fit through a space.",
                "Cats have a specialized collarbone that allows them to always land on their feet.",
                "Cats have five toes on their front paws and four toes on their back paws."
        };

        int index = random.nextInt(catFacts.length);
        return catFacts[index];
    }

    private String generateRandomTimestamp() {
        long minTimestamp = 946684800000L; // January 1, 2000
        long maxTimestamp = System.currentTimeMillis();
        long randomTimestamp = minTimestamp + (long) (random.nextDouble() * (maxTimestamp - minTimestamp));

        return String.valueOf(randomTimestamp);
    }
}

