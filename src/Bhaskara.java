public class Bhaskara {
    
    public static double[] calcularRaizes(double a, double b, double c) {
        double delta = (b * b) - (4 * a * c);
        System.out.println(delta);
        if (delta < 0) {
            return new double[0]; // Sem raízes reais
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            return new double[]{raiz}; // Uma raiz real
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{raiz1, raiz2}; // Duas raízes reais
        }
    }
    
}
