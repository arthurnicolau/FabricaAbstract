package ifes.fabrica.Model.Receitas;

import ifes.fabrica.Model.Ingredientes.CafeSoluvel;
import ifes.fabrica.Model.Ingredientes.Acucar;
import ifes.fabrica.Model.Ingredientes.Leite;

/**
 * Created by Arthur on 02/10/2015.
 */
public class IngredientesCafeNormal {
    private CafeSoluvel cafeSoluvel;
    private Acucar acucar;
    private Leite leite;

    public IngredientesCafeNormal(CafeSoluvel cafeSoluvel, Acucar acucar, Leite leite) {
        this.cafeSoluvel = cafeSoluvel;
        this.acucar = acucar;
        this.leite = leite;
    }

    public CafeSoluvel getCafeSoluvel() {
        return cafeSoluvel;
    }

    public void setCafeSoluvel(CafeSoluvel cafeSoluvel) {
        this.cafeSoluvel = cafeSoluvel;
    }

    public Acucar getAcucar() {
        return acucar;
    }

    public void setAcucar(Acucar acucar) {
        this.acucar = acucar;
    }

    public Leite getLeite() {
        return leite;
    }

    public void setLeite(Leite leite) {
        this.leite = leite;
    }
}
