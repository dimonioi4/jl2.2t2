public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 100;
        double height = 180;
        double bodymassindex = service.calculate(weight, height);
        System.out.println(bodymassindex);
    }
}