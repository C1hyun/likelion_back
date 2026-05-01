package Mission02;

import Mission02.lion.Lion;

public class Mission02_2 {

    public static void main(String[] args) {

        Lion lion = new Lion("박시현", "컴퓨터공학과", 14);

        System.out.println("name (public)   → 접근 성공: " + lion.name);

        System.out.println("major (default) → 직접 접근 시 컴파일 오류");
        System.out.println("grade (private) → 직접 접근 시 컴파일 오류");
    }
}