import java.util.Scanner;
public class MyProfile {
    public static void main(String[] args) {
        Profile myProfile = new Profile();
        myProfile.number();
        myProfile.myName();
        myProfile.println();
    }
}
class Profile{
    int num;
    String name;
    Scanner scn = new Scanner(System.in);
    public void number(){
        System.out.print("학번을 입력하세요 :");
        num = scn.nextInt();
    }
    public void myName(){
        System.out.print("이름을 입력하세요 :");
        name = scn.nextLine();
    }
    public void println(){
        System.out.println("입력한 학번은 "+num+" 이고, 이름은 "+name+" 입니다.");
    }
}
