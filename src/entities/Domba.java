public class Domba extends FarmAnimal implements Renderable, MeatProducingAnimal {

    public Domba(String _name) {
        super(_name, 15);
    }

    public String makeSound() {
        return name + ": HopHop";
    }

    @Override
    public FarmProduct getAnimalMeat() {
        DagingDomba D = new DagingDomba();
        return D;
    }

    public char render() {
        return 'D';
    }

    public boolean isHabitat(Land L) {
        char c = L.render();
        return c == '-' || c == '#';
    }
}