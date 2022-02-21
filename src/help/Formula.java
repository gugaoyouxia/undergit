package help;

public class Formula {
    public boolean isFormula(String s){
        Level level = new Level();
        if(s.length() == 1 && level.charType(s.charAt(0)) == 3){
            return true;
        }
        if(s.length() == 2 && level.charType(s.charAt(0)) == 2 && level.charType(s.charAt(1)) == 3){
            return true;
        }
        if(s.length() == 3 && level.charType(s.charAt(0)) == 3 && level.charType(s.charAt(2)) == 3 && level.charType(s.charAt(1)) == 1){
            return true;
        }

        int countL = 0, countR = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                countL++;
            }
            if(s.charAt(i) == ')'){
                countR++;
            }

        }
        if(countL != countR) return false;
        int[] string1 = level.findSubIndex(s,0);
        int[] string2 = level.findSubIndex(s, string1[1] + 1);
        int flag = 0;
        if(string2[0] == -1){
            if(string1[1] == s.length() - 1) {
                if(s.charAt(0) == '!' && string1[0] == 1) flag = 1;
                else if(level.charType(s.charAt(0)) == 3 && level.charType(s.charAt(1)) == 1) flag = 1;
            }

            else if(level.charType(s.charAt(string1[1] + 1)) == 1 && string1[1] + 2 <= s.length() - 1 && level.charType(s.charAt(string1[1]+2)) == 3) flag = 1;

            if(flag == 1){
                return isFormula(s.substring(string1[0] + 1, string1[1]));
            }
            else return false;
        }
        else{
            if(string1[0] == 0 && string2[1] == s.length() - 1 && level.charType(s.charAt(string1[1] + 1)) == 1 && string1[1] + 2 == string2[0] ){
                return (isFormula(s.substring(string1[0] + 1, string1[1])) && isFormula(s.substring(string2[0] + 1, string2[1])));
            }
        }
        return false;
    }
}
