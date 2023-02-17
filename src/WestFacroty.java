public class WestFacroty implements GUIFactory{
    @Override
    public Animal createDogs() {
        return new WestDogs();
    }

    @Override
    public People createMen() {
        return new WestMen();
    }
}
