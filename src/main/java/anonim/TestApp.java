package anonim;

import inner.Computer;
import inner.TradeItem;

public class TestApp {
    public TradeItem getAnonimClass(String type) {
        if (type == "COMP") {
            TradeItem computer = new TradeItem() {
                @Override
                public double getPrice() {
                    return 654321;
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

                public void getAnonim() {
                    System.out.println("Anonim class");
                }
            };
            return computer;
        }
        else {
            TradeItem mobile = new TradeItem() {
                @Override
                public double getPrice() {
                    return 123456;
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

                public void getAnonim() {
                    System.out.println("Anonim class");
                }
            };
            return mobile;
        }
    }
}
