public class Task2 {
    public static void main(String[] args) {
        /*
        Даны переменные: 
        - деньги которые у нас есть - 1000 рублей
        - стоимость пиццы - 230 рублей
        - стоимость жвачки - 26 рублей
        - стоимость конфеты - 2,5 рубля
        Задача: представим себе что мы зашли в магазин, и наша задача: купить максимум возможных пиц, затем на сдачу купить максимум жвачек,
        затем на оставшуюся сдачу купить конфет. 
        В результате нам нужно сделать математический просчет и вывести на консоль примерно вот такую информацию:
        На эти деньги мы можем купить:
        - 4 пиццы
        - 3 жвачки
        - 0 конфет
        Сдача с магазина: 2 рубля.
         */

        double money = 1200;
        int pizzaPrice = 230;
        int gumPrice = 26;
        double candyPrice = 2.5;

        int pizzas = (int) (money / pizzaPrice);
        money %= pizzaPrice;
        int gum = (int) (money / gumPrice);
        money %= gumPrice;
        int candies = (int) (money / candyPrice);
        money %= candyPrice;

        System.out.println("Pizzas bought:" + pizzas);
        System.out.println("Gum bought:" + gum);
        System.out.println("Candies bought:" + candies);
        System.out.println("Money left:" + money);

    }
}
