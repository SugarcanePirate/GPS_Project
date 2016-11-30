package LogicPackage.TipoAlimentos;

import LogicPackage.Ingrediente;

/*
*Classe Fruta extende a classe abstracta Ingrediente
 */
public class Fruta extends Ingrediente {

    public Fruta(String nome, int calorias, int quantidade) {
        super(nome, calorias, quantidade);
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Fruta)) {
            return false;
        }

        Fruta fruta = (Fruta) o;

        return fruta.getNome().equals(super.getNome());
    }

}
