import java.util.ArrayList;
import java.util.List;

public class Email {
    private final List<String> to;
    private final String subject;
    private final String body;
    private final List<String> attachments;

    private Email(EmailBuilder builder) {
        this.to = builder.to;
        this.subject = builder.subject;
        this.body = builder.body;
        this.attachments = builder.attachments;
    }

    // Getters
    public List<String> getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public List<String> getAttachments() {
        return attachments;
    }

    @Override
    public String toString() {
        return "Email{" +
                "to=" + to +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", attachments=" + attachments +
                '}';
    }

    // Builder class
    public static class EmailBuilder {
        private List<String> to;
        private String subject;
        private String body;
        private List<String> attachments;

        public EmailBuilder() {
            this.to = new ArrayList<>();
            this.attachments = new ArrayList<>();
        }

        public EmailBuilder addTo(String recipient) {
            this.to.add(recipient);
            return this;
        }

        public EmailBuilder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public EmailBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        public EmailBuilder addAttachment(String file) {
            this.attachments.add(file);
            return this;
        }

        public Email build() {
            return new Email(this);
        }
    }
}
