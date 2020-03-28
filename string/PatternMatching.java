package string;

public class PatternMatching {
    /*
    * Given two strings text and pattern count how many times
    * pattern appear in the text
    * */
    public static int burteForce(String text, String pattern){
        int count =0;
        for(int i=0; i<text.length(); i++){
            int index = i;
            for(int j=0; j<pattern.length(); j++){
                if(pattern.charAt(j) != text.charAt(i)) break;
                else{
                    i++;
                    if(j == pattern.length()-1 )count++;
                    if(i == text.length()) break;
                }
            }
            i = index;
        }
        return count;
    }

    public static void main(String[]args){
        String text ="nanapanamabananasnana";
        String pattern = "nana";
        System.out.println(burteForce(text,pattern));
    }


}
