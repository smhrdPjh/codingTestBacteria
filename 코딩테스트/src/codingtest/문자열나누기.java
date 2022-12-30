public class 문자열나누기 {

    public static void main(String[] args) {

        int check = solution("aaabbaccccabba");
        System.out.println(check);

    }

    public static int solution(String s){


        char x= s.charAt(0);
        int cntX =0;
        int cntNx =0;
        int count =0;


        for(int i=0; i <s.length();i++){


            if(x == s.charAt(i)){
                cntX++;
            }else{
                cntNx++;
            }
            if(i+1==s.length()){
                ++count;
                break;
            }
            if (cntX==cntNx){
                x=s.charAt(i+1);
                ++count;

            }
        }

        return count;
    }
}
