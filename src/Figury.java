public class Figury {

        static{
            System.out.println("Biblioteka obliczająca wilekości figur geometrycznych");
        }

        public static double PoleKola(double r){
            return Math.PI*Math.pow(r, 2);
        }

        public static double ObwodKola(double r){
            return Math.PI*2*r;
        }

        public static double ObwodKwadratu(double a){
            return 4*a;
        }

        public static double PoleKwadratu(double a){
            return Math.pow(a, 2);
        }

        public static double ObwodProstokata(double a, double b){
            return (2*a)+(2*b);
        }

        public static double PoleProstokata(double a, double b){
            return a*b;
        }

        public static double PoleWalca(double r, double h){
            return Math.PI*Math.pow(r, 2) + 2*Math.PI*r*h;
        }

        public static double ObjetoscWalca(double r, double h){
            return Math.PI*Math.pow(r, 2)*h;
        }

        public static double PoleStozka(double r, double h){
            return Math.PI*r *(r + (Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2))));
        }

        public static double ObjetoscStozka(double r, double h){
            return (Math.PI*Math.pow(r, 2)*h)/3;
        }
        public static double obwodTrojkata(double a, double b, double c){
            return a+b+c;
        }

        public static double poleTrojkata(double a, double h){
            return 0.5*a*h;
        }

        public static double poleTrapezu(double a, double b, double h){
            return 0.5*(a+b)*h;
        }

        public static double poleSzescianu(double a){
            return 6*a*a;
        }

        public static double objetoscSzescianju(double a){
            return Math.pow(a,3);
        }

        public static double poleProstopadloscianu(double a, double b, double c){
            return 2*(a*b) + 2*(a*c) + 2*(b*c);
        }
        public static double objetoscProstopadloscianu(double a, double b, double c){
            return a*b*c;
        }

        public static double poleKuli(double r){
            return 4*Math.PI*Math.pow(r,2);
        }

        public static double objetoscKuli(double r){
            return (4/3)*Math.PI*Math.pow(r,3);
        }

        public static void main(String[] args) {
            // TODO code application logic here
        }

}
