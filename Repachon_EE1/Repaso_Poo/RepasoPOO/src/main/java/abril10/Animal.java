package abril10;

public abstract class Animal {

    protected float peso;

    //Funciones asi "Public" normal - las clases q heredan hacen lo mismo
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    //Tdos los q hereden - pueden definir como usan esta funcion
    public abstract void hacerSonido();
}
