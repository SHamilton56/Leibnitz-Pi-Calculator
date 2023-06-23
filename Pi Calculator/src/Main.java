// Pi Calculator (Summation)
// Stuart Hamilton
// 6/23/23

public class Main {
    public static void main(String[] args) {
        float result = 1;
        String plusminus = "-";

        for(float n=1; n<=500; n=n+2){
            System.out.println(result * 4 + " "+ n);
            if(plusminus == "-"){
                result = result - 1/(n+2);
                plusminus = "+";
            } else if (plusminus == "+") {
                result = result + 1/(n+2);
                plusminus = "-";
            }
        }
    }
}