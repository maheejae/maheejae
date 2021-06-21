import java.util.Scanner;
public class FiHoSl {
    public static void main(String args[]) {
        Count myCount = new Count();
        myCount.setNumber();
        myCount.multiple();
        myCount.println();
    } 
}

class Count{
    int count = 0;
    int num;
    int mtp;
    Scanner scn = new Scanner(System.in);
    public void setNumber(){
        System.out.print("숫자를 입력하세요 :");
        num = scn.nextInt();        
    }
    public void multiple(){
        System.out.print("구하고 싶은 배수를 입력하세요 :");
        mtp = scn.nextInt();
    }

    public void println(){
        for(int i=1; i<=num; i++){
            if(i%mtp==0){
                count++;
            }
        }
        System.out.println("1부터 "+num+"까지 "+mtp+" 의 배수의 개수는 "+count+" 개 입니다.");    
    }
}