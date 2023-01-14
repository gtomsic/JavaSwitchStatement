public class PrintDayWeek {
    public static void main(String[] args){
        int day = 5;
        System.out.println("Day " + day + " is = " + printDay(day) );
    }

    public static String printDay(int day) {
        String dayOfWeek = switch (day) {
            case 0 -> { yield "Sunday"; }
            case 1 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        return dayOfWeek;
    }
}
