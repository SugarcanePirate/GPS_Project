package LogicPackage;

/*
*Classe Vegetais extende a classe abstracta Ingrediente
 */
public class Vegetal extends Ingrediente {

    public Vegetal(String nome, int calorias, int quantidade) {
        super(nome, calorias, quantidade);
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Vegetal)) {
            return false;
        }

        Vegetal vegetal = (Vegetal) o;

        return vegetal.getNome().equals(super.getNome());
    }

}
