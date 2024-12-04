import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts.FontName;

import java.io.IOException;
import java.util.ArrayList;



public class Pedefesiador {

public static void papu(ArrayList<Product> bolsitadealmendras) throws IOException{
        String archivo = "Productos seleccionados.pdf";

        try (PDDocument document = new PDDocument()) {
            // Crear una página en el documento
            PDPage pagina = new PDPage();
            document.addPage(pagina);
           
            FontName font_name_3v= Standard14Fonts.getMappedFontName("HELVETICA_BOLD");
            PDFont pdfFont=  new PDType1Font(font_name_3v.HELVETICA_BOLD);
            // Crear contenido para la página
            try (PDPageContentStream contenido = new PDPageContentStream(document, pagina)) {
                contenido.beginText();
                contenido.setFont(pdfFont, 12);
                contenido.setLeading(14.5f);
                contenido.newLineAtOffset(50, 750);

for (Product almendra : bolsitadealmendras) {
    contenido.showText("Producto: "+almendra.title);
    contenido.newLine();
    contenido.showText("Id: "+Integer.toString(almendra.id));
    contenido.newLine();
    contenido.showText("Precio: "+Double.toString(almendra.price));
    contenido.newLine();
    contenido.showText("Descripción: "+almendra.description);
    contenido.newLine();
    contenido.showText("Categoría: "+almendra.category.name);
    contenido.newLine();
    contenido.newLine();
    
    }
     contenido.endText();
     contenido.close();



            // Guardar el archivo PDF
            document.save(archivo);
            System.out.println("PDF creado correctamente en: " +archivo);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    }}









