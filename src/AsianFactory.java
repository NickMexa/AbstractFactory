public class AsianFactory implements GUIFactory{
    @Override
    public Animal createDogs() {
        return new AsianDogs();
    }

    @Override
    public People createMen() {
        return new AsianMen();
    }
}
