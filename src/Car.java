public class Car {
    public  static String Categori;
    private String Brand;
    private  String Model;
    private double engineCapacity;
    public static final String  CATEGORI_B = "Категория Б";
    public static final String  CATEGORI_С = "Категория С";
    public static final String  CATEGORI_D = "Категория D";

    public Car( String brand , String model, double engineCapacity) {
        Brand = brand;
        Model = model;
        this.engineCapacity = engineCapacity;
        if (model== null || model.isEmpty() || model.isBlank())
            System.out.println("Неверное значение");
        if (brand == null || brand.isEmpty() || brand.isBlank())
            System.out.println("Неверное значение");
        if (engineCapacity <= 0)
            System.out.println("Неверное значение");
    }
    public void passDiagnostics(){

    }
    public static void setCategoriB (String categoriB){
        if (CATEGORI_B == null ){
            throw new  IllegalArgumentException ("Необходимо указать тип прав!");
        }
    }
    public static void setCategoriС (String categoriС) {
        if (CATEGORI_С == null) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
    }
    public static void setCategoriD (String categoriD) {
        if (CATEGORI_D == null) {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }
    }


}
