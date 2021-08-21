import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        int num;
        String name;
        Scanner Iscn = new Scanner(System.in);
        Scanner Sscn = new Scanner(System.in);
        System.out.print("학번을 입력하세요 :");
        num = Iscn.nextInt();
        System.out.print("이름을 입력하세요 :");
        name = Sscn.nextLine();
        System.out.println("입력한 학번은 "+num+" 이고, 이름은 "+name+" 입니다.");
    }
}
