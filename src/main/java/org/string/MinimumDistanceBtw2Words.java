package org.string;

public class MinimumDistanceBtw2Words {

    public static void main (String[] args) {
        String[] S
                = { "the", "quick1", "brown", "fox", "quick" };

        String word1 = "the", word2 = "quick";

        // Function Call
        System.out.println(shortestDistance(S, word1, word2));
    }

    private static int shortestDistance(String[] s, String word1, String word2) {
        boolean word1Flag = false;
        boolean word2Flag = false;
        int count=0;

        for(String str : s){
            if(str.equals(word1))
                word1Flag = true;

            if(str.equals(word2))
                word2Flag = true;

            if(word1Flag != word2Flag)
                count++;
        }
        return count;
    }
}

