package LogicPackage.TipoAlimentos;

import LogicPackage.Ingrediente;

/*
*Classe Carne extende a classe abstracta Ingrediente
 */
public class Peixe extends Ingrediente {

    public Peixe(String nome, int calorias, int quantidade) {
        super(nome, calorias, quantidade);
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Peixe)) {
            return false;
        }

        Peixe peixe = (Peixe) o;

        return peixe.getNome().equals(super.getNome());
    }

}
