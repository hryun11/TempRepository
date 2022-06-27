public class Main {
    public static void main(String[] args) {
        // write your code here

        char score = 'A';
        switch (score) {
            case 'A':
                System.out.println("A등급 축하합니다.");
                break;
            case 'B':
                System.out.println("B등급");
                break;
            case 'C':
                System.out.println("C등급");
            default:
                System.out.println("C보다 아래등급입니다");
        }
    }
}