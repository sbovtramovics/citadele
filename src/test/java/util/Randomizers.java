package util;

import java.util.Random;

public class Randomizers {

    private static int random(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static String randomName() {
        Random rng = new Random();
        String lowCharacters = "abcdefghijklmnopqrstuvwxyz";
        String bigCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int lengthName = random(3, 10);
        char[] name = new char[lengthName];
        name[0] = bigCharacters.charAt(rng.nextInt(bigCharacters.length()));
        for (int i = 1; i < lengthName; i++) {
            name[i] = lowCharacters.charAt(rng.nextInt(lowCharacters.length()));
        }
        return new String(name);
    }

    public static String randomPassword() {
        Random rng = new Random();
        String lowCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        int lengthName = random(5, 10);
        char[] name = new char[lengthName];
        for (int i = 0; i < lengthName; i++) {
            name[i] = lowCharacters.charAt(rng.nextInt(lowCharacters.length()));
        }
        return new String(name);
    }
}