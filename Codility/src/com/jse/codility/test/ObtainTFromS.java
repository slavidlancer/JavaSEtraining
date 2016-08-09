package com.jse.codility.test;

public class ObtainTFromS {
    public static void main(String[] args) {
        String S = "nice";
        String T = "niece";
        
        /*String S = "from";
        String T = "form";*/
        
        /*String S = "o";
        String T = "odd";*/
        
        /*String S = "o";
        String T = "o";*/
        
        String result = new ObtainTFromS().estimateHowToObtainTFromS(S, T);
        
        System.out.println(result);
    }
    
    public String estimateHowToObtainTFromS(String S, String T) {
        int sizeS = S.length();
        int sizeT = T.length();
        String result = "IMPOSSIBLE";
        
        if (S.equals(T)) {
            result = "NOTHING";
        }
        
        /*for (int i = 0; i < Math.max(sizeS, sizeT); i++) {
            for (int j = 0; j < Math.min(sizeS, sizeT); j++) {
                if (S.charAt(i) == T.charAt(j)) {
                    
                }
            }
        }*/
        
        return result;
    }
    
    /* Given a string S and and String T, return:

    "INSERT x" if string S can be obtained from String T by at most one insertion of character x.

    For example, when S = "nice" and T = "niece", the method would return "INSERT e"

    "DELETE x" if string T can be obtained from String S by at most one deletion of character x.

    For example, when S = "hello" and T = "hell", the method would return "DELETE o"

    "SWAP x z" if string T can be obtained from String S by swapping two adjacent characters.

    For example, when S = "from" and T = "form", the method would return "SWAP r o"

    "IMPOSSIBLE" if string T cannot be obtained from string S according to the rules above

    "NOTHING" if string T equals string S */
}
