package restaurant.ru;

public class Restaurant2 {

    Integer pearsCount;
    String[] menu = {
            "Шарлотка грушевая",
            "Компот грушевый",
            "Салат из груш и лисичек",
            "Рулет с грушами"
    };

    public void showMenu() {
        for (int i = 0; i <= menu.length; i++) {
            System.out.println("Сегодня у нас в меню - " + menu[i]);
        }
    }
}
