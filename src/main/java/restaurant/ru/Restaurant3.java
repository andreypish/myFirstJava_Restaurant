package restaurant.ru;

public class Restaurant3 {
    Integer pearsCount = 2;
    String[] menu = {
            "Шарлотка грушевая",
            "Компот грушевый",
            "Салат из груш и лисичек",
            "Рулет с грушами"
    };

    public void showMenu() {
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Сегодня у нас в меню - " + menu[i]);
        }
    }

    public void checkPears() {
        if (pearsCount < 5) {
            System.out.println("Пора заказать ещё груш");
        } else if (pearsCount >= 5)
               while (pearsCount == 5) {
            System.out.println("Груш пока достаточно");
        }
    }

    public void cook(String name) {
        System.out.println("Готовим " + name);
        pearsCount -= 1;
    }

}
