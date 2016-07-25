package OOP.Mission_2.AirlineCompany;

public class AirPlane{
        private String name;
        private double capacity;
        private double numberGruz;
        private int rangeFlight;
        private int amountFuel;
        //конструкторы
        public AirPlane() {
        }

        public AirPlane(String name, int capacity, double numberGruz, int rangeFlight, int amountFuel) {
            this.name = name;
            this.capacity = capacity;
            this.numberGruz = numberGruz;
            this.rangeFlight = rangeFlight;
            this.amountFuel = amountFuel;
        }
        public AirPlane(String name, int capacity, double numberGruz) {
            this.name = name;
            this.capacity = capacity;
            this.numberGruz = numberGruz;
        }
        //определяем геттеры и сеттеры
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setCapacity(double capacity) {
            this.capacity = capacity;
        }
        public double getCapacity() {
            return capacity;
        }
        public void setNumberGruz(double numberGruz) {
            this.numberGruz = numberGruz;
        }
        public double getNumberGruz() {
            return numberGruz;
        }
        public void setRangeFlight(int rangeFlight) {
            this.rangeFlight = rangeFlight;
        }
        public int getRangeFlight() {
            return rangeFlight;
        }
        public void setAmountFuel(int amountFuel) {
            this.rangeFlight = rangeFlight;
        }
        public int getAmountFuel() {
            return rangeFlight;
        }
        @Override
        public String toString() {
            return "Самолет" + " " + name + "  "+"Общая вместимость =" +" "+ capacity + " "
                    + "Грузоподьемность=" + " " + numberGruz + "тонн "+" " + "Дальность полета:" + " "
                    + rangeFlight +"км "+" "+"Количество потребляемого горючего=" + " " + amountFuel;
        }
}
