import java.util.HashMap;

    import java.util.ArrayList;
import java.util.HashMap;
import java.util.SortedMap;

    class Car{
        String brand;
        String model;
        String color;
        String type;
        int price;

        public Car(String brand, String model, String color, String type, int price) {
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.type = type;
            this.price = price;
        }

        @Override
        public String toString() {
            return
                    "brand->'" + brand + '\'' +
                            ", model->'" + model + '\'' +
                            ", color->'" + color + '\'' +
                            ", type->'" + type + '\'' +
                            ", price->" + price
                    ;
        }
    }

    public class HashDemo {
        public static void main(String[] args) {
            Car c1 = new Car("BMW","x1","black","Hatchback",1000000);
            Car c2 = new Car("Toyota","Camry","black","Sedan",200000);
            Car c3 = new Car("Audi","A4","red","Sedan",500000);
            Car c4 = new Car("Hyundai","Creta","blue","SUV",20000);
            Car c5 = new Car("Tata","Nexon","yellow","SUV",10000);

            HashMap<String,Car> listOfCars = new HashMap<>();
            listOfCars.put(c1.model,c1);
            listOfCars.put(c2.model,c2);
            listOfCars.put(c3.model,c3);
            listOfCars.put(c4.model,c4);
            listOfCars.put(c5.model,c5);
            System.out.println(listOfCars);
            listOfCars.forEach((k,v) -> System.out.println("Key = " + k+ " ;" + " Value : "+v));

        }

    }
//Hashmap is a datastructure which stores the data in a pair of keys and values
//Hashmap[ is a part of collection framework
//Hashmap is generally used for fetching data faster due to time complexity og o(1)
//it is used to store non indexed values


