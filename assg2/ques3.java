package assg2;

public class ques3 {
    static String mapp[] = {".",".","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printComb(String s,int i,String res){
        // base case
        if(i==s.length()){
            System.out.print(res+" ");
            return;
        }
        int dig = s.charAt(i) - '0';
        // find the mapped string value of digit
        String mappedStr = mapp[dig];
        for(int j=0;j<mappedStr.length();j++){
            printComb(s, i+1,res+mappedStr.charAt(j));
            // remove the last char of res
            res = res.substring(0,res.length());
        }
    }
    public static void main(String[] args) {
        String s = "23";
        printComb(s, 0, "");
    }
}
