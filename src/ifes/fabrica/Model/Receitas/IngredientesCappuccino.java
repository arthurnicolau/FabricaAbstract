package ifes.fabrica.Model.Receitas;

import ifes.fabrica.Model.Ingredientes.CafeSoluvel;
import ifes.fabrica.Model.Ingredientes.*;

/**
 * Created by Arthur on 02/10/2015.
 */
public class IngredientesCappuccino {
    CafeSoluvel cafeSoluvel;
    Acucar acucar;
    LeiteEmPo leiteEmPo;
    Bicarbonato bicarbonato;
    ChocolatePo chocolatePo;
    Canela canela;

    public IngredientesCappuccino(CafeSoluvel cafeSoluvel, Acucar acucar, LeiteEmPo leiteEmPo, Bicarbonato bicarbonato, ChocolatePo chocolatePo, Canela canela) {
        this.cafeSoluvel = cafeSoluvel;
        this.acucar = acucar;
        this.leiteEmPo = leiteEmPo;
        this.bicarbonato = bicarbonato;
        this.chocolatePo = chocolatePo;
        this.canela = canela;
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

    public LeiteEmPo getLeiteEmPo() {
        return leiteEmPo;
    }

    public void setLeiteEmPo(LeiteEmPo leiteEmPo) {
        this.leiteEmPo = leiteEmPo;
    }

    public Bicarbonato getBicarbonato() {
        return bicarbonato;
    }

    public void setBicarbonato(Bicarbonato bicarbonato) {
        this.bicarbonato = bicarbonato;
    }

    public ChocolatePo getChocolatePo() {
        return chocolatePo;
    }

    public void setChocolatePo(ChocolatePo chocolatePo) {
        this.chocolatePo = chocolatePo;
    }

    public Canela getCanela() {
        return canela;
    }

    public void setCanela(Canela canela) {
        this.canela = canela;
    }
}
