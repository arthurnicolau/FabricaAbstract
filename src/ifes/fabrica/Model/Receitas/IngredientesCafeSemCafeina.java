package ifes.fabrica.Model.Receitas;

import ifes.fabrica.Model.Ingredientes.Acucar;
import ifes.fabrica.Model.Ingredientes.Leite;
import ifes.fabrica.Model.Ingredientes.SemCafeina;

/**
 * Created by Arthur on 02/10/2015.
 */
public class IngredientesCafeSemCafeina {
    private SemCafeina semCafeina;
    private Acucar acucar;
    private Leite leite;


    public IngredientesCafeSemCafeina(SemCafeina semCafeina, Acucar acucar, Leite leite) {
        this.semCafeina = semCafeina;
        this.acucar = acucar;
        this.leite = leite;
    }

    public SemCafeina getSemCafeina() {
        return semCafeina;
    }

    public void setSemCafeina(SemCafeina semCafeina) {
        this.semCafeina = semCafeina;
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
