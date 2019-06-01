public class Frito extends Estado {

    public Frito(Pastel pastel) {

        super(pastel);

    }

    @Override
    public void vender(Pastel pastel) {

        System.out.println("Pastel sendo vendido");
    }

    @Override
    public void fritar(Pastel pastel) {

        System.out.println("Pastel já esta frito");
    }
}
