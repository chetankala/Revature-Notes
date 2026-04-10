public class App {
    public static void main(String[] args) {
        /**
         * Spring helps us manage our objects and their dependency injections.
         * With large applications, we have a lot of classes that depend on each other.
         * Objects that are managed by Spring are called Beans.
         * One way to configure our beans is through XML.
         * IOC Container -> Inversion of Control, beans, and dependency injections are controlled by the container.
         */

        // We need to create an application context to read the XML file and create the beans.
        ApplicationContext contextXML = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) contextXML.getBeans("helloWorld");
        System.out.println(obj.getMessage());

        // We can also create beans for our own classes and inject dependencies through the XML file.
        Animal animal1 = (Animal) contextXML.getBeans("animal1");
        System.out.println(animal1);

        Animal animal2 = (Animal) contextXML.getBeans("animal2");
        System.out.println(animal2);

        Owner owner1 = (Owner) contextXML.getBeans("owner1");
        System.out.println(owner1);

        Owner owner2 = (Owner) contextXML.getBeans("owner2");
        System.out.println(owner2);

        List<String> animalTypes = (ArrayList) contextXML.getBeans("animals");
        System.out.println(animalTypes);
    }
}