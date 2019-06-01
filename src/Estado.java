public abstract class Estado {


    Pastel pastel;

    Estado(Pastel pastel){
        this.pastel = pastel;
    }

   abstract void vender(Pastel pastel);

    abstract void fritar(Pastel pastel);
}
