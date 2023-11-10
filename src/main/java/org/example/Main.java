package org.example;

public class Main {
    public static void main(String[] args) {
        EmpresaAerea empresa = new EmpresaAerea();

        Passagem passagemNacional = new Passagem("Nacional", 500.0);
        System.out.println("Valor final da passagem nacional: " + empresa.calcularValorFinal(passagemNacional));

        Passagem passagemInternacional = new Passagem("Internacional", 1000.0);
        System.out.println("Valor final da passagem internacional: " + empresa.calcularValorFinal(passagemInternacional));
    }
}