package ifes.fabrica.Model;

import ifes.fabrica.Model.Receitas.IngredientesCafeNormal;
import ifes.fabrica.Model.ifes.fabrica.Interfaces.ICafeNormal;

/**
 * Created by Arthur on 02/10/2015.
 */
public class CafeNormal implements ICafeNormal{
    private Double valor = 2.00;
    private IngredientesCafeNormal ingredientesCafeNormal;

    @Override
    public void exibirInfoCafeNormal() {
        System.out.println("Valor cafe normal:" + this.valor);

    }

    public IngredientesCafeNormal getIngredientesCafeNormal() {
        return ingredientesCafeNormal;
    }

    public void setIngredientesCafeNormal(IngredientesCafeNormal ingredientesCafeNormal) {
        this.ingredientesCafeNormal = ingredientesCafeNormal;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
