package br.com.financeManager.dominio.enums;

public enum NivelNecessidadeGastoEnum {

    BAIXA(0),
    MUITO_BAIXA(1),
    BAIXISSIMA(2),
    MEDIA(3),
    ALTA(5),
    MUITO_ALTA(6),
    ALTISSIMA(7);

    private int value;

    NivelNecessidadeGastoEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static NivelNecessidadeGastoEnum obterPorNome(String nome) {
        return NivelNecessidadeGastoEnum.valueOf(nome);
    }
}
