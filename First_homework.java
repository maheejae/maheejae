import java.util.Scanner;
public class First_homework {
    public static void main(String[] args) {
        int count = 0;
        Scanner scn = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 :");
        int toNumber = scn.nextInt(); 
        System.out.print("구하고 싶은 배수를 입력하세요 :");
        int n = scn.nextInt();

        for(int i=1; i<=toNumber; i++){
            if(i%n==0){
                count++;
            }
        }
        System.out.println("1부터 "+toNumber+"까지 "+n+" 의 배수의 개수는 "+count+" 개 입니다.");
    }
}
