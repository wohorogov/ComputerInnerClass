package local_inner;

import inner.TradeItem;

public class TestApp {
    public TradeItem getLocalClass(String type) {
        class Computer implements TradeItem {

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

            public String getType() {
                return "Computer";
            }
        }

        class MobilePhone implements TradeItem {

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

            public String getType() {
                return "Mobile";
            }
        }

        if (type == "COMP") {
            return new Computer();
        }
        else return new MobilePhone();

    }
}
