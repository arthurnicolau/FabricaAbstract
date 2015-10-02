package ifes.fabrica.Model;

import ifes.fabrica.Model.Ingredientes.Acucar;
import ifes.fabrica.Model.Ingredientes.CafeSoluvel;
import ifes.fabrica.Model.Ingredientes.Leite;
import ifes.fabrica.Model.Receitas.IngredientesCafeNormal;
import ifes.fabrica.Model.ifes.fabrica.Interfaces.IFabricaCafe;

/**
 * Created by Arthur on 02/10/2015.
 */
public class Cafeteira implements IFabricaCafe {

    @Override
    public CafeNormal criaCafeNormal() {
        CafeNormal cafeNormal = new CafeNormal();
        CafeSoluvel cafeSoluvel = new CafeSoluvel();
        Acucar acucar = new Acucar();
        Leite leite = new Leite();
        cafeSoluvel.setQuantidade(50);
        acucar.setQuantidade(2);
        leite.setQuantidade(100);
        IngredientesCafeNormal ingredientesCafeNormal = new IngredientesCafeNormal(cafeSoluvel,acucar,leite);
        cafeNormal.setIngredientesCafeNormal(ingredientesCafeNormal);
        return new CafeNormal();
    }

    @Override
    public CafeSemCafeina criaCafeSemCafeina() {
        return new CafeSemCafeina();
    }

    @Override
    public CafeCappuccino criaCafeCappuccino() {
        return new CafeCappuccino();
    }
}
