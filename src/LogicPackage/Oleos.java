package LogicPackage;

public class Oleos extends Ingrediente {

    public Oleos(String nome, int calorias, int quantidade) {
        super(nome, calorias, quantidade);
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Oleos)) {
            return false;
        }

        Oleos oleos = (Oleos) o;

        return oleos.getNome().equals(super.getNome());
    }
}
