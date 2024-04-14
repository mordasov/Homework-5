public class Main {
    public static void main(String[] args) {

        //task-1
        int clientOS = (int) (Math.random() * 2);  //0 - iOS, 1 - Android
        System.out.println("ОС телефона: " + clientOS);
        if(clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке\n");
        }

        //task-2
        int clientOSNew = (int) (Math.random() * 2);  //0 - iOS, 1 - Android
        System.out.println("ОС телефона: " + clientOSNew);
        int clientDeviceYear = (int) (Math.random() * 15) + 2009;
        System.out.println("Год выпуска ОС телефона: " + clientDeviceYear);
        if(clientDeviceYear < 2015 && clientOSNew == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке\n");
        } else if(clientDeviceYear < 2015 && clientOSNew == 1){
                System.out.println("Установите облегченную версию приложения для Android по ссылке\n");
        } else if(clientDeviceYear >= 2015 && clientOSNew == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке\n");
        } else if(clientDeviceYear >= 2015 && clientOSNew == 1){
            System.out.println("Установите версию приложения для Android по ссылке\n");
        } else {
            System.out.println("Приложение под вашу систему не найдено\n");
        }

        //task-3
        int year = (int) (Math.random() * 500) + 1585;

        if(year % 400 == 0) {
            System.out.println(year + " год является високосным\n");
        } else if(year % 100 == 0) {
            System.out.println(year + " год не является високосным\n");
        } else if(year % 4 == 0){
            System.out.println(year + " год является високосным\n");
        } else {
            System.out.println(year + " год не является високосным\n");
        }

        //task-4
        int deliveryDistance = (int) (Math.random() * 130) + 1;
        int dayForDelivery = 1;
        if(deliveryDistance > 100){
            System.out.println("Расстояние " + deliveryDistance + " км. Свыше 100 км доставки нет.");
        } else if(deliveryDistance > 60) {
            System.out.println("Расстояние " + deliveryDistance + " км. Потребуется дней: " + dayForDelivery * 3);
        } else if(deliveryDistance > 20) {
            System.out.println("Расстояние " + deliveryDistance + " км. Потребуется дней: " + dayForDelivery * 2);
        } else {
            System.out.println("Расстояние " + deliveryDistance + " км. Потребуется дней: " + dayForDelivery);
        }
        System.out.println();

        //task-5
        int monthNumber = (int) (Math.random() * 15);
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Месяц: " + monthNumber + ". Сезон: зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц: " + monthNumber + ". Сезон: весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц: " + monthNumber + ". Сезон: лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц: " + monthNumber + ". Сезон: осень.");
                break;
            default:
                System.out.println("Месяц: " + monthNumber + ". Такого месяца не существует.");
        }
    }
}