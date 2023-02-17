public class Application {
    private Animal dogs;
    private People men;

    public Application(GUIFactory factory) {
        dogs = factory.createDogs();
        men = factory.createMen();
    }

    public void makeSound(){
        dogs.makeSound();
        men.makeSound();
    }
}
