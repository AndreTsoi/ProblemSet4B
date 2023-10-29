import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        




    }

    public static String palindrome(String word) {
        String nonLetters = ",.:;()[]{}!?@#$%^&* ";
        String str = "";
        for (int i = 0; i < word.length(); i++) {
            String letter = word.substring(i,i+1);
            if (!nonLetters.contains(letter)) {
                str += letter;
            }
        }

        String palindrome = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            palindrome += str.substring(i, i+1);
        }


        return palindrome;


    }

    public static String pigLatin(String string) {
        String str = "";

        String words[] = string.split(" ");

        for (String word : words) {
            if (word.length() > 2) {
                str += pigLatinWord(word) + " ";
            } else {
                str += word + " ";
            }

        }

        return str;


    }

    public static String pigLatinWord(String string) {
        String str = "";

        for (int i = 1; i < string.length(); i++) {
            str += string.substring(i, i + 1);
        }

        str += string.substring(0, 1) + "ay";

        return str;


    }


    public static int ascending(int min, int max){
        int count = 0;
        for (int i = min; i < max; i++) {
            if (isAscending(i) == true) {
                count++;
            }
        }




        return count;

    }

    public static boolean isAscending(int num) {
        int smallest = 10;

        while(num > 0) {

            if (num%10 < smallest) {
                smallest = num%10;
                num /= 10;

            } else {
                return false;
            }





        }

        return true;

    }

    public static void timesTable(int num) {
        int largest = num * num;
        int space = String.valueOf(largest).length() + 1;


        //number of rows
        for (int i = 1; i <= num; i++) {
            int current = i;

                //printing of row
                for (int f = 0; f < num; f++) {
                    //calculate space
                    for (int v = 0; v < space - (String.valueOf(current).length()); v++ ) {
                        System.out.print(" ");
                    }

                    System.out.print(current);

                    current += i;

                    if (f == num - 1) {
                        System.out.println("");
                    }

                }







        }





    }



}