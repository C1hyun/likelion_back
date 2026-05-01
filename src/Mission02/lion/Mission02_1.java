package Mission02.lion;

public class Mission02_1 {

    public static void main(String[] args) {

        {
            String name = "박시현";
            String major = "컴퓨터공학과";
            int grade = 14;

            if (name == null || name.isBlank()) {
                System.out.println("이름은 빈 값일 수 없습니다.");
            } else if (major == null || major.isBlank()) {
                System.out.println("전공은 빈 값일 수 없습니다.");
            } else if (grade < 1) {
                System.out.println("기수는 1 이상이어야 합니다. 입력값: " + grade);
            } else {
                Lion lion = new Lion(name, major, grade);
                lion.introduce();
            }
        }

        System.out.println();

        {
            Lion lion = new Lion("  ", "컴퓨터공학과", 14);
            if (lion.isValid()) {
                lion.introduce();
            } else {
                System.out.println("케이스 1: 유효하지 않아 소개를 생략합니다.");
            }
        }

        System.out.println();

        {
            Lion lion = new Lion("박시현", "  ", 14);
            if (lion.isValid()) {
                lion.introduce();
            } else {
                System.out.println("케이스 2: 유효하지 않아 소개를 생략합니다.");
            }
        }

        System.out.println();

        {
            Lion lion = new Lion("박시현", "컴퓨터공학과", -1);
            if (lion.isValid()) {
                lion.introduce();
            } else {
                System.out.println("케이스 3: 유효하지 않아 소개를 생략합니다.");
            }
        }
    }
}