public class Preparado extends Estado {

    public Preparado(Pastel pastel) {

        super(pastel);

    }

    @Override
    public void vender(Pastel pastel) {

        System.out.println("Pastel ainda precisa ser frito");
    }

    @Override
    public void fritar(Pastel pastel) {

        System.out.println("Pastel sendo frito");
        pastel.setEstado(new Frito(pastel));
    }
}
