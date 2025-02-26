public class BmiService {
    public int calculate(double weight, double height) {
        double coefficient = weight / (height * height);  // расчет ИМТ как double
        return (int) coefficient;
    }
}
