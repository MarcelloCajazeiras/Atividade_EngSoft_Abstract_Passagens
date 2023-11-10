package org.example;

public class EmpresaAerea {
    public double calcularTaxaEmbarque(Passagem passagem) {
        if ("Nacional".equalsIgnoreCase(passagem.getTipoVoo())) {
            return 0.05 * passagem.getValorPassagem();
        } else if ("Internacional".equalsIgnoreCase(passagem.getTipoVoo())) {
            return 0.10 * passagem.getValorPassagem();
        } else {
            throw new TipoVooInvalidoException("Tipo de voo inválido: " + passagem.getTipoVoo());
        }
    }

    public double calcularTaxaBagagem(Passagem passagem) {
        if ("Nacional".equalsIgnoreCase(passagem.getTipoVoo())) {
            return 0.03 * passagem.getValorPassagem();
        } else if ("Internacional".equalsIgnoreCase(passagem.getTipoVoo())) {
            return 0.05 * passagem.getValorPassagem();
        } else {
            throw new TipoVooInvalidoException("Tipo de voo inválido: " + passagem.getTipoVoo());
        }
    }

    public double calcularValorFinal(Passagem passagem) {
        return passagem.getValorPassagem() + calcularTaxaEmbarque(passagem) + calcularTaxaBagagem(passagem);
    }
}
