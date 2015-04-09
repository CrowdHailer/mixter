package mixter.domain.core.message;

import mixter.domain.identity.UserId;

class PublishMessage {
    private final String message;
    private final UserId authorId;
    PublishMessage(String message, UserId author) {
        this.message = message;
        this.authorId = author;
    }

    public UserId getAuthorId() {
        return authorId;
    }

    public String getMessage() {
        return message;
    }
}
