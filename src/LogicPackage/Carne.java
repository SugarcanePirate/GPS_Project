package LogicPackage;

/*
*Classe Carne extende a classe abstracta Ingrediente
 */
public class Carne extends Ingrediente {

    public Carne(String nome, int calorias, int quantidade) {
        super(nome, calorias, quantidade);
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Carne)) {
            return false;
        }

        Carne carne = (Carne) o;

        return carne.getNome().equals(super.getNome());
    }

}
