public class BmiService {
    public double calculate(double height, int weight) {
    double calculate = weight / (height * height);
    return calculate;
    }

}
