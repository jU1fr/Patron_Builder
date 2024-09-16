import java.util.List;

public class EmailConstructor {


    public Email createSimpleEmail(String recipient, String subject, String body) {
        return new Email.EmailBuilder()
                .addTo(recipient)
                .setSubject(subject)
                .setBody(body)
                .build();
    }


    public Email createEmailWithAttachments(List<String> recipients, String subject, String body, List<String> attachments) {
        Email.EmailBuilder builder = new Email.EmailBuilder()
                .setSubject(subject)
                .setBody(body);

        // Agregar destinatarios
        for (String recipient : recipients) {
            builder.addTo(recipient);
        }

        // Agregar adjuntos
        for (String attachment : attachments) {
            builder.addAttachment(attachment);
        }

        return builder.build();
    }
}
