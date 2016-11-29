package LogicPackage;

public class Cereal extends Ingrediente {

    public Cereal(String nome, int calorias, int quantidade) {
        super(nome, calorias, quantidade);
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Cereal)) {
            return false;
        }

        Cereal cereal = (Cereal) o;

        return cereal.getNome().equals(super.getNome());
    }

}
