public class BmiService {
    public int calculate(double weight, double height) {
        double bmi = weight / (height * height);  // расчет ИМТ как double
        return (int) bmi;
    }
}
