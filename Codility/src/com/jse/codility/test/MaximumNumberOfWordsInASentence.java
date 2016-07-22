package com.jse.codility.test;

public class MaximumNumberOfWordsInASentence {
    public static void main(String[] args) {
        String S = "We test coders. Give us a try?";
        //String S = "Forget  CVs..Save time . x x";
        //String S = "Forget ! CVs?..Save time . .x! x? x.";
        //String S = "d.!? .!?";
        //String S = "q";
        //String S = "We test  coders .!? Give us. a try!.?";
        
        int maxNumberOfWords = new MaximumNumberOfWordsInASentence().
                getMaxNumberOfWords(S);
        
        System.out.println(maxNumberOfWords);
    }

    private int getMaxNumberOfWords(String S) {
        /*String[] sentences = S.replace("?", "|").replace("!", "|").
         * replace(".", "|").split("\\|");*/
        //System.out.println(Arrays.toString(sentences));
        String[] sentences = S.split("[[\\.]*|[!]*|[?]*]+");
        int sizeOfArray = sentences.length;
        
        //System.out.println(Arrays.toString(sentences));
        
        int max = 0;
        
        for (int i = 0; i < sizeOfArray; i++) {
            sentences[i] = sentences[i].trim();
            String[] words = sentences[i].split("\\s+");
            int currentMax = words.length;
            
            /*System.out.println(Arrays.toString(words));
            System.out.println(currentMax);*/
            
            if (currentMax > max) {
                max = currentMax;
            }
        }
        
        return max;
    }
}
