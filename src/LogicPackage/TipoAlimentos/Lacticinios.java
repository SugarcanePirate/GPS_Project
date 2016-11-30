package LogicPackage.TipoAlimentos;

import LogicPackage.Ingrediente;

public class Lacticinios extends Ingrediente {

    public Lacticinios(String nome, int calorias, int quantidade) {
        super(nome, calorias, quantidade);
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Lacticinios)) {
            return false;
        }

        Lacticinios lacticinios = (Lacticinios) o;

        return lacticinios.getNome().equals(super.getNome());
    }
}
