    public class Quadratic {
        static double a = 2.3, b = 4, c = 5.6;
       static double root1, root2;
       public void quadRatic(){
           if (determinant > 0) {

               root1 = (-b + Math.sqrt(determinant)) / (2 * a);
               root2 = (-b - Math.sqrt(determinant)) / (2 * a);

               System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
           }

           else if (determinant == 0) {
               root1 = root2 = -b / (2 * a);
               System.out.format("root1 = root2 = %.2f;", root1);
           }

           else {

               double real = -b / (2 * a);
               double imag = Math.sqrt(-determinant) / (2 * a);
               System.out.format("root1 = %.2f+%.2fi", real, imag);
               System.out.format("\nroot2 = %.2f-%.2fi", real, imag);
           }
       }
       static double determinant = b * b - 4 * a * c;
        public static void main(String[] args) {
            Quadratic q  = new Quadratic();
            q.quadRatic();
        }
    }

