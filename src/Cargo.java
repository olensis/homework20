public class Cargo  extends  Car{
    public Cargo(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }
    public void passDiagnostics(){
        System.out.println(" Я прохожу диагностику");

    }
}
