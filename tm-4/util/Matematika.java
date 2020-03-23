package util;

public class Matematika {

    public static int faktorial(int n) {
        if(n == 1) return n;
        else return n * faktorial(n-1);
    }

}