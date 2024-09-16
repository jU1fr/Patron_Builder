import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EmailConstructor constructor = new EmailConstructor();

        // Crear un correo simple utilizando EmailConstructor
        Email simpleEmail = constructor.createSimpleEmail(
                "lechugamanuel2003@gmail.com",
                "Asunto Simple",
                "Este es un correo simple."
        );

        // Crear un correo con varios destinatarios y adjuntos utilizando EmailConstructor
        Email emailWithAttachments = constructor.createEmailWithAttachments(
                Arrays.asList("lechugamanuel2003@gmail.com", "jlechugao@miumg.edu.gt"),
                "Asunto con Adjuntos",
                "Este correo contiene varios destinatarios y archivos adjuntos.",
                Arrays.asList("archivo1.pdf", "archivo2.docx")
        );

        // Imprimir ambos correos
        System.out.println("Correo Simple:");
        System.out.println(simpleEmail);

        System.out.println("\nCorreo con Adjuntos:");
        System.out.println(emailWithAttachments);
    }
}
