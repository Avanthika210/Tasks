public class Main{
    public static void main(String[] args){
        String word="";
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch=='Z'){
                System.out.println('A');
            }else{
                char nextchar=(char)(ch+1);
                System.out.println(nextchar);
            }
        }
    }
}
