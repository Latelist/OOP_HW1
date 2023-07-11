package Domen;

// Создать наследника Product реализовать класс ГорячийНапиток(Hot Drink) с дополнительным полем int температура.
// Для класса ГорячихНапитков(Hot Drink) написать конструктор и переопределить метод toString()
// В main добавить в автомат несколько ГорячихНапитков(Hot Drink) и воспроизвести логику заложенную в программе
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

public class HotDrink extends Product {
    private float temperature;

    HotDrink(int price, int place, String name, long id) {
        super(price,place,name,id);
        this.temperature = 0f;
    }

    HotDrink(int price, int place, String name, long id, float temperature) {
        super(price,place,name,id);
        this.temperature = temperature;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        if (temperature >= 50 && temperature < 100) {
            this.temperature = temperature;
        }
    }

    @Override
    public String toString() {
        String description = "A cup of " + this.getName() + ", " + temperature + "degrees hot.";
        return description;
    }

}
