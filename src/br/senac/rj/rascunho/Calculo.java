
package br.senac.rj.rascunho;

public class Calculo {
    private String valor01;
    private String valor02;

    public String getValor01() {
        return valor01;
    }

    public void setValor01(Integer valor01) {
        this.valor01 = converteTipo(valor01);
    }

    public String getValor02() {
        return valor02;
    }

    public void setValor02(Integer valor02) {
        this.valor02 = converteTipo(valor02);
    }
    
    public int getMedia() {
        return (converteTipo(valor01) + converteTipo(valor02)) / 2;
    }
    
    private int converteTipo(String valor) {
        return Integer.valueOf(valor);
    }
    
    private String converteTipo(Integer valor) {
        return valor.toString();
    }
    
    public static void main(String[] args) {
        Calculo c = new Calculo();
        
        c.setValor01(10);
        c.setValor02(43);
        
        System.out.println(c.getMedia());
    }
}
