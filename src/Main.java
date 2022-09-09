public class Main {
    public static void main(String[] args) {

        // задача 3

        // если делитсц на 400 знасчит печатаем « …. год является високосным».
        // если год делитсц на 100 не является високосным
        // если делитсц на 4 знасчит печатаем « …. год является високосным».
        //

        int year = 2021;

        if (year % 400 == 0) {
            System.out.println(" Год високосный ");

         } else if (year % 100 == 0) {
            System.out.println(" Год не является високостным ");

        } else if (year % 4 == 0) {
            System.out.println(" Год високосный ");

        } else {
            System.out.println(" Год не является високостным ");

        }


    }


}
