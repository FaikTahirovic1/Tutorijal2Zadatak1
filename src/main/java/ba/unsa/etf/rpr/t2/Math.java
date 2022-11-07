package ba.unsa.etf.rpr.t2;

public class Math {
    public final static double PI =3.14159;

    public static double sin(double ulaz){
        double zbir = 0;
        for(int i = 0; i < 6; i++){
            zbir = zbir + power(-1,i) * (power(ulaz,2*i+1)/faktorijel(2*i+1));
        }
        return zbir;

    }
    public static int faktorijel(int a){
        int x = 1;
        for(int i = 2; i <= a; i++){
            x = x * i;
        }
        return x;
    }
    public static double power(double a, int n){
        double p = 1;
        for(int i = 0; i < n; i++){
            p = p * a;
        }
        return p;
    }
}
