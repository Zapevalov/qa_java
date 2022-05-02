package com.example.lionTypes;

public class Persica implements ILionType {
    private final double averageWeight = 170;
    private final String latinName = "Panthera leo persica";

    @Override
    public double getAverageWeight() {
        return averageWeight;
    }

    @Override
    public String getDesc() {
        return "Имеет заметные пучки шерсти на локтях и на конце хвоста, мощные когти и острые клыки, которыми они " +
                "перетаскивают добычу по земле. Самцы имеют цвет от желтовато-оранжевого до темно-коричневого, " +
                "львицы песочные или коричнево-желтоватые. Грива львов темного цвета, редко черная, короче, " +
                "чем у африканского льва.";
    }

    @Override
    public String getLatinName() {
        return latinName;
    }
}
