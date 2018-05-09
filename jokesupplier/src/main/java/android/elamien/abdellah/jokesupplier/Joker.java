package android.elamien.abdellah.jokesupplier;

import java.util.Random;

public class Joker {
    private String[] jokes = new String[]{
            "Can a kangaroo jump higher than a house? \n" +
                    "Of course, a house can't jump at all",
            "Doctor: \"I'm sorry but you suffer from a terminal illness and have only 10 to live.\"\n" +
                    "Patient: \"What do you mean, 10? 10 what? Months? Weeks?!\"\n" +
                    "Doctor: \"Nine.\"",
            "A man asks a farmer near a field, \"Sorry sir, would you mind if I crossed your field instead of going around it?\n" +
                    " You see, I have to catch the 4:23 train." +
                    "The farmer says, \"Sure, go right ahead. And if my bull sees you, \n" +
                    "you'll even catch the 4:11 one.",
            "Anton, do you think I'm a bad mother?\n" +
                    "My name is Paul.",
            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.",
            "Why is six afraid of seven? \n" +
                    "because seven ate nine",
            "The past, present and future walk into a bar. it was tense",
            "This is your captain speaking, AND THIS IS YOUR CAPTAIN SHOUTING.",
            "Just changed my Facebook name to 'No one' so when I see stupid posts I can click like and it will say 'No one likes this'.",
            "What do you call a bear with no teeth? \n A gummy bear!",
            "Wife: \"I look fat. Can you give me a compliment? \n Husband: \"You have perfect eyesight.",
            "What do you call a dinosaur that is sleeping?\n" +
                    "A dino-snore!",
            "What did the left eye say to the right eye?\n" +
                    "Between us, something smells!",
            "What did one plate say to the other plate?\n" +
                    "Dinner is on me!"
    };

    public String getRandomJoke() {
        Random random = new Random();
        int index = random.nextInt(jokes.length);
        return jokes[index];
    }
}
