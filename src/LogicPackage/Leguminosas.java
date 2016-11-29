package LogicPackage;

public class Leguminosas extends Ingrediente {

    public Leguminosas(String nome, int calorias, int quantidade) {
        super(nome, calorias, quantidade);
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Leguminosas)) {
            return false;
        }

        Leguminosas leguminosas = (Leguminosas) o;

        return leguminosas.getNome().equals(super.getNome());
    }

}
