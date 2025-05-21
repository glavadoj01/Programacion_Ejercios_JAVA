package ejercicio05;

public class AppTest {
    public static void main(String[] args) {
        HasMapCrud hasMapCrud = new HasMapCrud();

        hasMapCrud.create("key1", "value1");
        hasMapCrud.create("key2", "value2");
        hasMapCrud.create("key3", "value3");
        hasMapCrud.create("key4", "value4");
        hasMapCrud.create("key5", "value5");

        System.out.println("*********************");
        System.out.println("Valor clave 1");
        System.out.println(hasMapCrud.read("key1"));
        System.out.println("Valor clave 2");
        System.out.println(hasMapCrud.read("key2"));
        System.out.println("Valor clave 3");
        System.out.println(hasMapCrud.read("key3"));

        System.out.println("*********************");
        System.out.println("Actualizar Valor clave 4");
        hasMapCrud.update("key4", "value44");
        System.out.println(hasMapCrud.read("key4"));

        System.out.println("*********************");
        System.out.println("Borrar clave 5 => Imprimir clave 5");
        hasMapCrud.borrar("key5");
        System.out.println(hasMapCrud.read("key5"));

        System.out.println("*********************");
        System.out.println("Imprimir todos:");
        hasMapCrud.printMap();
    }
}
