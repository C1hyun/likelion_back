package Mission02.lion;

public class Lion {

    public String name;

    String major;

    private int grade;

    public Lion(String name, String major, int grade) {
        this.name = name;
        this.major = major;
        this.grade = grade;
    }

    public boolean isValid() {
        if (name == null || name.isBlank()) {
            System.out.println("[검증 실패] 이름은 빈 값일 수 없습니다.");
            return false;
        }
        if (major == null || major.isBlank()) {
            System.out.println("[검증 실패] 전공은 빈 값일 수 없습니다.");
            return false;
        }
        if (grade < 1) {
            System.out.println("[검증 실패] 기수는 1 이상이어야 합니다. 입력값: " + grade);
            return false;
        }
        return true;
    }

    public void introduce() {
        System.out.println("안녕하세요! 저는 " + grade + "기 " + major + " 전공 " + name + "입니다.");
    }
}