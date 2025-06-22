// Classe que representa o carro e suas funções
public class Car {
    private boolean ligado;
    private int velocidade;
    private int marcha;
    private String direcao;

    public Car() {
        this.ligado = false;
        this.velocidade = 0;
        this.marcha = 0;
        this.direcao = "reto";
    }

    public boolean ligar() {
        if (!ligado) {
            ligado = true;
            return true;
        }
        return false;
    }

    public boolean desligar() {
        if (ligado && marcha == 0 && velocidade == 0) {
            ligado = false;
            return true;
        }
        return false;
    }

    public boolean acelerar() {
        if (!ligado || marcha == 0)
            return false;
        int maxVel = getMaxVelocidadePorMarcha();
        if (velocidade < maxVel && velocidade < 120) {
            velocidade++;
            return true;
        }
        return false;
    }

    public boolean diminuirVelocidade() {
        if (!ligado)
            return false;
        if (velocidade > 0) {
            velocidade--;
            return true;
        }
        return false;
    }

    public boolean trocarMarcha(int novaMarcha) {
        if (!ligado)
            return false;
        if (novaMarcha == marcha + 1 || novaMarcha == marcha - 1) {
            if (novaMarcha >= 0 && novaMarcha <= 6) {
                if (velocidadeDentroDaMarcha(novaMarcha)) {
                    marcha = novaMarcha;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean virar(String direcao) {
        if (!ligado)
            return false;
        if (velocidade >= 1 && velocidade <= 40) {
            if (direcao.equalsIgnoreCase("esquerda") || direcao.equalsIgnoreCase("direita")) {
                this.direcao = direcao;
                return true;
            }
        }
        return false;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public boolean isLigado() {
        return ligado;
    }

    public String getDirecao() {
        return direcao;
    }

    private int getMaxVelocidadePorMarcha() {
        switch (marcha) {
            case 1:
                return 20;
            case 2:
                return 40;
            case 3:
                return 60;
            case 4:
                return 80;
            case 5:
                return 100;
            case 6:
                return 120;
            default:
                return 0;
        }
    }

    private boolean velocidadeDentroDaMarcha(int marcha) {
        switch (marcha) {
            case 0:
                return velocidade == 0;
            case 1:
                return velocidade >= 0 && velocidade <= 20;
            case 2:
                return velocidade >= 21 && velocidade <= 40;
            case 3:
                return velocidade >= 41 && velocidade <= 60;
            case 4:
                return velocidade >= 61 && velocidade <= 80;
            case 5:
                return velocidade >= 81 && velocidade <= 100;
            case 6:
                return velocidade >= 101 && velocidade <= 120;
            default:
                return false;
        }
    }
}
