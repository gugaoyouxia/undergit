package KMP;

public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        if(haystack.length() == 0){
            return -1;
        }
        //构建next数组
        int[] next = new int[needle.length()];
        int i , j;
        next[0] = 0;
        for(i = 1; i < needle.length(); i++){
            if(needle.charAt(i) == needle.charAt(next[i - 1])){
                next[i] = next[i - 1] + 1;
            }
            else{
                j = next[i - 1];
                while(j > 0 && needle.charAt(j) != needle.charAt(i)){
                    j = next[j - 1];
                    if(needle.charAt(j) == needle.charAt(i)){
                        next[i] = j + 1;
                        break;
                    }
                }
            }
        }
        int[] next1 = new int[needle.length()];
        System.arraycopy(next, 0, next1, 1, needle.length() - 1);


        int p1 = 0, p2 = 0;
        while(p1 < haystack.length()){
            while(haystack.charAt(p1) == needle.charAt(p2)){
                if(p2 == needle.length() - 1){
                    return p1 - p2;
                }
                if(p1 == haystack.length() - 1) return -1;
                p1++;
                p2++;
            }
            if(haystack.charAt(p1) == needle.charAt(next1[p2])){
                p2 = next1[p2] + 1;
            }
            else{
                p2 = next1[p2];
                while(p2 > 0 && haystack.charAt(p1) != needle.charAt(p2)){
                    p2 = next1[p2];
                    if(haystack.charAt(p1) == needle.charAt(p2)){
                        p2++;
                        break;
                    }
                }
            }
            p1++;
            if(p2 >= needle.length()){
                return -1;
            }
        }
        return -1;
    }
}
