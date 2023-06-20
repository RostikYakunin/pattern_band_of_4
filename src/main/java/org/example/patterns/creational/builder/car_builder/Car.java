package org.example.patterns.creational.builder.car_builder;

public class Car {
    private final int id;
    private final String model;
    private final String name;
    private final int weight;
    private final String color;
    private final int numbersOfDoors;

    public Car(int id, String model, String name, int weight, String color, int numbersOfDoors) {
        this.id = id;
        this.model = model;
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.numbersOfDoors = numbersOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ", numbersOfDoors=" + numbersOfDoors +
                '}';
    }

    public static class Builder {
        private int id;
        private String model;
        private String name;
        private int weight;
        private String color;
        private int numbersOfDoors;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setNumbersOfDoors(int numbersOfDoors) {
            this.numbersOfDoors = numbersOfDoors;
            return this;
        }

        public Car build () {
            return new Car(
                    id,
                    model,
                    name,
                    weight,
                    color,
                    numbersOfDoors
            );
        }
    }
}
