public class Main {

    private static Application configuration(){
        Application app;
        GUIFactory factory;

        String nationalityChoice = System.getProperty("nation.name").toLowerCase();

        if (nationalityChoice.contains("asian")){
            factory = new AsianFactory();
        } else {
            factory = new WestFacroty();
        }

        app = new Application(factory);
        return app;
    }
    public static void main(String[] args) {
        Application app = configuration();
        app.makeSound();
    }
}