package inner;

import java.io.Serializable;

public class Computer implements TradeItem, Serializable {

    public Computer() {
        SoftWare softWare = new SoftWare( 1000);
        KeyBoard keyBoard = new KeyBoard(10, 2000);
        MotherBoard motherBoard = new MotherBoard(1, 4000);
        Processor processor = new Processor(0.5, 10000);
    }

    class SoftWare {
        private double weight = 0;
        private double price;

        public SoftWare(double price) {
            this.price = price;
        }

        public double getWeight() {
            return weight;
        }

        public double getPrice() {
            return price;
        }
    }

    class KeyBoard{
        private double weight;
        private double price;

        public KeyBoard(double weight, double price) {
            this.weight = weight;
            this.price = price;
        }

        public double getWeight() {
            return weight;
        }

        public double getPrice() {
            return price;
        }
    }

    class MotherBoard {
        private double weight;
        private double price;

        public MotherBoard(double weight, double price) {
            this.weight = weight;
            this.price = price;
        }

        public double getWeight() {
            return weight;
        }

        public double getPrice() {
            return price;
        }
    }

    class Processor {
        private double weight;
        private double price;

        public Processor(double weight, double price) {
            this.weight = weight;
            this.price = price;
        }

        public double getWeight() {
            return weight;
        }

        public double getPrice() {
            return price;
        }
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public double getEnergyConsumption() {
        return 0;
    }

    @Override
    public double getGuaranteePeriod() {
        return 0;
    }

    @Override
    public String toString() {
        return "Hello from computer.";
    }
}
