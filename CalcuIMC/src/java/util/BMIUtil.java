package util;

public class BMIUtil {
    
    // calculo del indice de masa corporal
    public static double calculateBMI(double height, double weight) {
        return weight / (height * height);
    }
    // filtro para la altura
    public static boolean isValidHeight(double height) {
        return height >= 1 && height <= 2.5;
    }
    // filtro para la edad
    public static boolean isValidAge(int age) {
        return age >= 15;
    }
}
