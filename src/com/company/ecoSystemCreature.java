package com.company;

// Класс всегда с заглавной буквы
// Этот класс мне не нравится. По его названию можно судить, что он будет общим для всех сущностей, но в этомнет смысла
// На мгновение представим, что этот класс будет базовым. В таком случае, разве у базового класса могут быть собственные экземпляры? - почитай про абстрактный класс и для чего он нужен
abstract class  EcoSystemCreature {
   private String type;
   private int power;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

