import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Product[] atunes = Arreglador.obtenerproductos();
        List<Product> atuncios = Arrays.asList(atunes);
        ArrayList<Product> atúnidos = new ArrayList<>(atuncios);


        System.out.println("Productos cargados en memoria con éxito!");
        Menusillo.menu(atúnidos);
    }
}
// No borrar por si acaso!
/*  String json = "{\n" +
                "  \"id\": 2,\n" +
                "  \"title\": \"Classic Red Pullover Hoodie\",\n" +
                "  \"price\": 10,\n" +
                "  \"description\": \"Elevate your casual wardrobe with our Classic Red Pullover Hoodie. Crafted with a soft cotton blend for ultimate comfort, this vibrant red hoodie features a kangaroo pocket, adjustable drawstring hood, and ribbed cuffs for a snug fit. The timeless design ensures easy pairing with jeans or joggers for a relaxed yet stylish look, making it a versatile addition to your everyday attire.\",\n" +
                "  \"images\": [\n" +
                "    \"https://i.imgur.com/1twoaDy.jpeg\",\n" +
                "    \"https://i.imgur.com/FDwQgLy.jpeg\",\n" +
                "    \"https://i.imgur.com/kg1ZhhH.jpeg\"\n" +
                "  ],\n" +
                "  \"creationAt\": \"2024-11-21T00:36:25.000Z\",\n" +
                "  \"updatedAt\": \"2024-11-21T00:36:25.000Z\",\n" +
                "  \"category\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"Clothes\",\n" +
                "    \"image\": \"https://i.imgur.com/QkIa5tT.jpeg\",\n" +
                "    \"creationAt\": \"2024-11-21T00:36:25.000Z\",\n" +
                "    \"updatedAt\": \"2024-11-21T00:36:25.000Z\"\n" +
                "  }\n" +
                "}";
     */
