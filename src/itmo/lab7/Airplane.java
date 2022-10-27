package itmo.lab7;

public class Airplane {

    static class Wind {
        private float windWeight;

        public Wind(float windWeight) {

            this.windWeight = windWeight;
        }

        void printWindWeight() {

            System.out.println("Вес крыла: " + windWeight);
        }
    }

    public static void main(String[] args) {

        Airplane.Wind var1 = new Airplane.Wind(100.7f);
        var1.printWindWeight();

        Airplane.Wind var2 = new Airplane.Wind(101.3f);
        var2.printWindWeight();

    }


}
