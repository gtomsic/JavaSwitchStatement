public class Main {
    public static void main(String[] args) {
        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value either 3, 4 or a 5");
                System.out.println("Actual value is: " + switchValue);
                break;
            default:
                System.out.println("No match found.");
                break;
        }
    }
}