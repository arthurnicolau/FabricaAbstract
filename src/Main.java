import ifes.fabrica.Model.CafeCappuccino;
import ifes.fabrica.Model.CafeNormal;
import ifes.fabrica.Model.CafeSemCafeina;
import ifes.fabrica.Model.Cafeteira;
import ifes.fabrica.Model.ifes.fabrica.Interfaces.IFabricaCafe;

class Application {

    public static void main(String[] args) {
        IFabricaCafe fabricaCafe = new Cafeteira();
        CafeCappuccino cafeCappuccino = fabricaCafe.criaCafeCappuccino();
        cafeCappuccino.exibeInfoCappuccino();
        CafeSemCafeina cafeSemCafeina = fabricaCafe.criaCafeSemCafeina();
        cafeSemCafeina.exibeInfoSemCafeina();
        CafeNormal cafeNormal = fabricaCafe.criaCafeNormal();
        cafeNormal.exibirInfoCafeNormal();

    }
}
