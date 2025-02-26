public class BmiService {
    public int calculate(double weight, double height) {
        double coefficient = weight / (height * height);
        return (int) coefficient;
    }
}
