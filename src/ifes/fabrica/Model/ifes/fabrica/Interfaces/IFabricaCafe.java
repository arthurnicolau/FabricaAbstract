package ifes.fabrica.Model.ifes.fabrica.Interfaces;

import ifes.fabrica.Model.CafeCappuccino;
import ifes.fabrica.Model.CafeNormal;
import ifes.fabrica.Model.CafeSemCafeina;

/**
 * Created by Arthur on 02/10/2015.
 */
public interface IFabricaCafe {

    public CafeNormal criaCafeNormal();

    public CafeSemCafeina criaCafeSemCafeina();

    public CafeCappuccino criaCafeCappuccino();
}
