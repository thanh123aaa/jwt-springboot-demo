package rabbitmq;

import com.rabbitmq.client.*;

public class Consumer {

    private static final String QUEUE_NAME = "hello_queue";

    public static void main(String[] args) throws Exception {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("localhost");

        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(
                QUEUE_NAME,
                false,
                false,
                false,
                null
        );

        System.out.println("📥 Waiting for messages...");

        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody());
            System.out.println("✅ Received: " + message);
        };

        channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> {});
    }
}
