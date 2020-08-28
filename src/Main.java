import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String word = " ";
        int vowel = 0;
        do {
            System.out.println("Enter yoru text string: ");
            Scanner input = new Scanner(System.in);
            word = input.nextLine();
            int wordLength = word.length() - 1;
            vowel = 0;

            do {
                switch (word.charAt((wordLength))) {
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                        vowel++;
                        break;

                }

                wordLength--;
            } while (wordLength > -1 && !word.equals("q"));

            if (!word.equals("q"))
               System.out.println( word + " has " + vowel + " vowels.");
        }while(!word.equals("q"));

    }
}
