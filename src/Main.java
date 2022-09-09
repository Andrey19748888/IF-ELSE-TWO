public class Main {
    public static void main(String[] args) {


        int clientDeviceYear = 2014;
        boolean isAndroid = true;
        if (clientDeviceYear < 2015) {
            if (isAndroid /* == true */) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");

            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else {
            System.out.println("Установите обычную версию приложения по ссылке");
        }
    }
}
