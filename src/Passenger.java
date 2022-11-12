public class Passenger extends  Car{
    public Passenger(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }
    public void passDiagnostics(){
        System.out.println(" Я прохожу диагонстику");

    }
}
