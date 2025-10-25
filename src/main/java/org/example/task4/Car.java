package main.java.org.example.task4;

public class Car implements Comparable {

        private int price;
        private int year; // рік виготовлення
        private int horsePower;

    public void Comparable(int price, int year, int horsePower) {
        this.price = price;
        this.year = year;
        this.horsePower = horsePower;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Car) {
            if (getPrice() > ((Car) o).getPrice()) {
                return -1;
            } else if (getPrice() == ((Car) o).getPrice()) {
                if (getYear() > ((Car) o).getYear()) {
                    return -1;
                } else if (getYear() == ((Car) o).getYear()) {
                    if (((Car) o).horsePower > horsePower) {
                        return -1;
                    }
                }
            }
            return 1;
        }
        return 0;
    }
}
