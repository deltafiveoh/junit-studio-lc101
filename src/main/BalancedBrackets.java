package main;


import java.util.ArrayList;

public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {
//        ArrayList<Character> bracketList = new ArrayList<>();
//
//        for (int x = 0; x < str.length(); x++){
//            char[] strArr = str.toCharArray();
//            if (strArr[x] == '[' || strArr[x] == ']'){
//                bracketList.add(strArr[x]);
//            }
//        }
//
//        while (bracketList.size() > 0){
//            int closer = bracketList.indexOf(']');
//            if (bracketList.get(closer-1)=='['){
//                bracketList.remove(closer);
//                bracketList.remove(closer-1);
//            } else if (bracketList.get(closer-1)==']' || bracketList.indexOf(']')==0){
//                return false;
//            }
//        }
//
//        return bracketList.size() == 0;

        int brackets = 0;
        int openIndex = 0;
        int closeIndex = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                brackets++;
                openIndex += str.indexOf("[");
            }
            if (ch == ']') {
                brackets--;
                closeIndex += str.indexOf("]");
            }
        }

        if (openIndex <= closeIndex){
            return brackets == 0;
        } else {
            return false;
        }


    }



}
