public class BmiService {

    public double calculate(double weight, double height) {
        double a = height / 100; // Рост в см
        double divider = a * a; // делитель в формуле Индекса массы тела(квадрат роста)
        double bodymassindex = weight / divider;
        return bodymassindex;
    }
}

