package homeAssignments.week1.day2;

public class IsPrimeNumber {
    public static void main(String[] args){
        int num = 13;
        boolean flag = false;
        if(num == 0 || num == 1){
            System.out.println(num+" is not a prime number");
        }
        else{
            for(int i=2;i<=num/2;i++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println(num+" is not a prime number");
            }
            else{
                System.out.println(num+" is a prime number");
            }
        }
    }
}
