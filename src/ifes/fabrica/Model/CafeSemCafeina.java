package ifes.fabrica.Model;

import ifes.fabrica.Model.Ingredientes.Acucar;
import ifes.fabrica.Model.Ingredientes.Leite;
import ifes.fabrica.Model.Ingredientes.SemCafeina;
import ifes.fabrica.Model.ifes.fabrica.Interfaces.ICafeSemCafeina;
import ifes.fabrica.Model.ifes.fabrica.Interfaces.IFabricaCafe;

/**
 * Created by Arthur on 02/10/2015.
 */
public class CafeSemCafeina implements ICafeSemCafeina {
    private Double valor= 3.00;
    @Override
    public void exibeInfoSemCafeina() {
        System.out.println("Valor cafe sem Cafeína:" + this.valor);
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
