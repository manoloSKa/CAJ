package util;

public class BMIUtil {
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }

    public static boolean isValidHeight(double height) {
        return height >= 1 && height <= 2.5;
    }

    public static boolean isValidAge(int age) {
        return age >= 15;
    }
}
