package DesignPatterns.Builder;

public class MessageBuilder {
    private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;

    private MessageBuilder(MessageType messageType, String content, String sender, String recipient, boolean isDelivered, long timestamp) {
        this.messageType = messageType;
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
        this.isDelivered = isDelivered;
        this.timestamp = timestamp;
    }

    public static Builder getuilder(){return new Builder();}


    public static class Builder{//take,validate,return obj
        private MessageType messageType;
        private String content;
        private String sender;
        private String recipient;
        private boolean isDelivered;
        private long timestamp;

        public Builder MessageType(MessageType messageType) {
            this.messageType = messageType;
            return this;
        }

        public Builder Content(String content) {
            this.content = content;
            return this;
        }

        public Builder Sender(String sender) {
            this.sender = sender;
            return this;
        }

        public Builder Recipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public Builder Delivered(boolean delivered) {
            isDelivered = delivered;
            return this;
        }

        public Builder Timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public MessageBuilder build(){
            return new MessageBuilder(this.messageType,this.content,this.sender,this.recipient,this.isDelivered,this.timestamp);
        }
    }
}
