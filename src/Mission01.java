import java.util.Scanner;

public class Mission01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count;

        while (true) {
            System.out.print("저장할 아기사자 수를 5 이상 입력해주세요.\n");
            count = Integer.parseInt(sc.nextLine());
            if (count >= 5) {
                break;
            } else {
                System.out.println("\n [오류] 5 이상 입력해주세요.");
            }
        }
        String[] lions = new String[count];
        sc.nextLine();
        System.out.println("\n아기사자 이름을 입력해주세요.");
        for (int i = 0; i < count; i++) {
            lions[i] = sc.nextLine();
        }
        System.out.println("\n아기사자 명단을 최종적으로 출력합니다");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + lions[i]);
        }
        sc.close();
    }
}