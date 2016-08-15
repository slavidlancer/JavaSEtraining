package com.jse.codility.test;

public class ObtainTFromS {
    public static void main(String[] args) {
        String S = "nice";
        String T = "niece";
        
        /*String S = "pout";
        String T = "put";*/
        
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
        String result = "IMPOSSIBLE";
        String check = null;
        
        check = checkIfInsertionMakesStringsEqual(S, T);
        
        if (check != null) {
            result = "INSERT " + check;
        }
        
        check = checkIfDeletionMakesStringsEqual(S, T);
        
        if (check != null) {
            result = "DELETE " + check;
        }
        
        check = checkIfSwappingMakesStringsEqual(S, T);
        
        if (check != null) {
            result = "SWAP " + check;
        }
        
        if (S.equals(T)) {
            result = "NOTHING";
        }
        
        return result;
    }
    
    private String checkIfInsertionMakesStringsEqual(String S, String T) {
        int sizeS = S.length();
        int sizeT = T.length();
        
        if ((sizeS + 1) != sizeT) {
            return null;
        }
        
        char[] sCharArr = S.toCharArray();
        char[] tCharArr = T.toCharArray();
        int sizeSArr = sCharArr.length;
        int sizeTArr = tCharArr.length;
        
        for (int i = 0; i < sizeTArr; i++) {
            if (i == (sizeTArr - 1)) {
                String checkS = S + tCharArr[i];
                
                if (T.equals(checkS)) {
                    return String.valueOf(tCharArr[i]);
                } else {
                    return null;
                }
            }
            
            if (sCharArr[i] != tCharArr[i]) {
                String checkS = S.substring(0, i) + tCharArr[i] +
                        S.substring(i, sizeSArr);
                
                if (T.equals(checkS)) {
                    return String.valueOf(tCharArr[i]);
                } else {
                    return null;
                }
            } else {
                continue;
            }
        }
        
        return null;
    }
    
    private String checkIfDeletionMakesStringsEqual(String S, String T) {
        int sizeS = S.length();
        int sizeT = T.length();
        
        if ((sizeS - 1) != sizeT) {
            return null;
        }
        
        char[] sCharArr = S.toCharArray();
        char[] tCharArr = T.toCharArray();
        int sizeSArr = sCharArr.length;
        //int sizeTArr = tCharArr.length;
        
        for (int i = 0; i < sizeSArr; i++) {
            if (i == (sizeSArr - 1)) {
                String checkS = S.substring(0, (sizeSArr -1));
                
                if (T.equals(checkS)) {
                    return String.valueOf(sCharArr[i]);
                } else {
                    return null;
                }
            }
            
            if (sCharArr[i] != tCharArr[i]) {
                String checkS = S.substring(0, i) + S.substring((i + 1),
                        sizeSArr);
                
                if (T.equals(checkS)) {
                    return String.valueOf(sCharArr[i]);
                } else {
                    return null;
                }
            } else {
                continue;
            }
        }
        
        return null;
    }
    
    private String checkIfSwappingMakesStringsEqual(String S, String T) {
        int sizeS = S.length();
        int sizeT = T.length();
        
        if (sizeS != sizeT) {
            return null;
        }
        
        char[] sCharArr = S.toCharArray();
        //char[] tCharArr = T.toCharArray();
        int sizeSArr = sCharArr.length;
        //int sizeTArr = tCharArr.length;
        
        for (int i = 0; i < (sizeSArr - 1); i++) {
            swapChars(sCharArr, i, (i + 1));
            String checkS = new String(sCharArr);
            
            if (T.equals(checkS)) {
                String swaps = sCharArr[i + 1] + " " + sCharArr[i];
                
                return swaps;
            }
            
            swapChars(sCharArr, i, (i + 1));
        }
        
        return null;
    }
    
    private void swapChars(char[] charArr, int i, int j) {
        char temp = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;
    }
}
