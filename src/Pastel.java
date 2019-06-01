public class Pastel {

    Estado estado;

    public Pastel(){
        this.estado = new Preparado(this);
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void fritar(){
        estado.fritar(this);
    }

    public void vender(){
        estado.vender(this);
    }

}
