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
}
