package Formulas;

import java.text.DecimalFormat;

public class Forms {

    private DecimalFormat df = new DecimalFormat("#0.00");

    public double distrBinom(int x, int n, double p) {
        int valueCombinat = combinat(n, x);
        return valueCombinat * Math.pow(p, x) * Math.pow((1 - p), (n - x));
    }

    public int combinat(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public double sumatoria(double... n) {
        double resultado = 0d;
        for (int i = 0; i < n.length; ++i) {
            resultado += n[i];
        }
        return resultado;
    }

    public double cronbach(double totalSumatoria, double k) {
        double resultado = k * totalSumatoria ;
        return resultado;
    }

    public double varS(double... n) {
        double media = average(n);
        double sumatoria = 0d;
        double resultado = 0;

        for (int i = 0; i < n.length; ++i) {
            sumatoria += Math.pow((n[i] - media), 2);
        }
        resultado = sumatoria / (n.length - 1);

        return Double.parseDouble(df.format(Math.abs(resultado)));
    }

    public double average(double... n) {
        double media = 0.0;
        for (int i = 0; i < n.length; ++i) {
            media += n[i];
        }
        return media / n.length;
    }

    public double vaiken(String s, String c) {
        return Double.parseDouble(s) / Double.parseDouble(c);
    }
}
