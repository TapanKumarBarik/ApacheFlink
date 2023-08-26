package org.example.DataStream;

import java.util.Random;

public class GenerateRandomNames {

     static String[] generateRandomNames(int count) {
        String[] names = new String[count];
        for (int i = 0; i < count; i++) {
            names[i] = generateRandomName();
        }
        return names;
    }

     static String generateRandomName() {
        String alphabet = "tspan";
        int nameLength = 3;//new Random().nextInt(6) + 5; // Random length between 5 and 10 characters
        StringBuilder name = new StringBuilder();

        for (int i = 0; i < nameLength; i++) {
            if (i == 0) {
                name.append(Character.toUpperCase(alphabet.charAt(new Random().nextInt(alphabet.length()))));
            } else {
                name.append(alphabet.charAt(new Random().nextInt(alphabet.length())));
            }
        }

        return name.toString();
    }
}