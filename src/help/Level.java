package help;

public class Level {
    public int levelOfFormula(String s){
        if(s.length() == 1 && charType(s.charAt(0)) == 3){
            return 1;
        }
        if(s.length() == 2 && charType(s.charAt(0)) == 2 && charType(s.charAt(1)) == 3){
            return 2;
        }
        if(s.length() == 3 && charType(s.charAt(0)) == 3 && charType(s.charAt(2)) == 3 && charType(s.charAt(1)) == 1){
            return 2;
        }

        int[] string1 = findSubIndex(s,0);
        int[] string2 = findSubIndex(s, string1[1] + 1);

        int level1 = 1, level2 = 1;
        level1 += levelOfFormula(s.substring(string1[0]+1,string1[1]));
        if(string2[0] != -1){
            level2 += levelOfFormula(s.substring(string2[0]+1,string2[1]));
        }
        else level2 = 0;
        return Math.max(level1, level2);

    }

    public int[] findSubIndex(String s, int start){
        int i;
        int flag = 0;
        int[] ret = new int[2];
        for(i = start; i < s.length(); i++){
            if(s.charAt(i) == '('){
                flag = 1;
                ret[0] = i;
                break;
            }
        }
        i++;
        int countL = 0, countR = 0;
        for(; i < s.length(); i++){
            if(s.charAt(i) == '('){
                countL++;
            }
            if(s.charAt(i) == ')'){
                countR++;
                if (countL < countR){
                    ret[1] = i;
                    break;
                }
            }
        }
        if(flag == 1){
            return ret;
        }
        return new int[]{-1, -1};
    }

    public int charType(char ch){
        if(ch == '&' || ch == '|' || ch == '>' || ch == '-'){
            return 1;
        }
        else if(ch == '!'){
            return 2;
        }
        return 3;
    }
}
