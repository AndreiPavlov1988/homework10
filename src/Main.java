public class Main {
    public static void main(String[] args) {
        checkLeapYear(2024);
        suggestApp(0, 2014);
        int days = calculateDeliveryDays(95);
        System.out.println("Потребуется дней: " + days);
    }
    //task 1
    public static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    //task 2
    public static void suggestApp(int osType, int deviceYear) {
        int currentYear = 2024;
        String osName = osType == 0 ? "iOS" : "Android";
        String version = deviceYear < currentYear ? "облегченную" : "";
        System.out.println("Установите " + version + " версию приложения для " + osName + " по ссылке");
    }
    //task 3
    public static int calculateDeliveryDays(int distance) {
        if (distance > 100) return -1;
        if (distance > 60) return 3;
        if (distance > 20) return 2;
        return 1;
    }
}