package de.telran.dushar.oksana.homework5;

public class TempConverter {
    /* 4) напишите класс с методами для конвертации градусы цельсия в фаренгейты и метод для конвертации фаренгейтов
            в цельсия (Фаренгейт — 32) : 1,8 = Цельсий Пример: (50°F - 32) : 1,8 = 10°C Цельсий х 1,8 + 32 = Фаренгейт
            Пример: 10°C x 1,8 + 32 = 50°F */
    public int temp;
    public TempConverter(int temp) {
        this.temp = temp;
    }

    public int toFahrenheit() {
        return (int) ((this.temp - 32) / 1.8);
    }

    public int toCelsius() {
        return (int) ((this.temp * 1.8) + 32);
    }
}
