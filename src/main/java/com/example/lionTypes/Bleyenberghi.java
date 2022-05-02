package com.example.lionTypes;

public class Bleyenberghi implements ILionType {
    private final double averageWeight = 200;
    private final String latinName = "Leo Bleyenberghi";

    @Override
    public double getAverageWeight() {
        return averageWeight;
    }

    @Override
    public String getDesc() {
        return "Встречается в западной Замбии и Зимбабве, Анголе, Заире, Намибии и северной Ботсване. " +
                "Эти львы являются одними из крупнейших среди всех видов львов. Самцы весят около 140–242 кг, " +
                "самки около 105–170 кг. Гривы у самцов светлее, чем у других подвидов.";
    }

    @Override
    public String getLatinName() {
        return latinName;
    }
}
