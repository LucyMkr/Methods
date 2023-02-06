public class Main {
    public static void main(String[] args) {
        int countOfWord = count("The country of old legends and Biblical stories is Armenia . To visit Armenia is to travel back in history and feel the spirit of more than 41 centuries. Experience first hand the \"country sheltered by Biblical Ararat\" home of Noah's Ark; the land where human kind was reborn.", "Armenia");
        if (countOfWord == -2) {
            System.out.println("-2");
        } else if (countOfWord == 0) {
            System.out.println("-1");
        } else {
            System.out.println(countOfWord);

        }
    }

    public static int count(String text, String theWord) {
        int all;
        int word;
        int balance;
        int sum = 0;
        int finder;
        for (word = 0; word < theWord.length(); word++) {
        }
        for (all = 0; all < text.length(); all++) {
        }
        if (all == 0 || word == 0) {
            finder = -2;
            return finder;
        }
        else {
            for (String New : text.split(theWord)) {

                for (balance = 0; balance < New.length(); balance++) {
                }
                sum += balance;
            }
            int needed = all - sum;
            finder = needed / word;
            return finder;
        }
    }
}
