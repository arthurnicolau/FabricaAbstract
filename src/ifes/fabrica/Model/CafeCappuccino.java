package ifes.fabrica.Model;

import ifes.fabrica.Model.ifes.fabrica.Interfaces.ICafeCappuccino;
import ifes.fabrica.Model.ifes.fabrica.Interfaces.IFabricaCafe;

/**
 * Created by Arthur on 02/10/2015.
 */
public class CafeCappuccino implements ICafeCappuccino{
    private Double valor = 5.00;


    @Override
    public void exibeInfoCappuccino() {
        System.out.println("Valor cafe Cappuccino:" + this.valor);

    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
