package com.reddis.Integration4.all;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.redis.outbound.RedisQueueOutboundChannelAdapter;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class MessageListner {
	@Autowired
	private JedisConnectionFactory jedisconnectionFactory;
@ServiceActivator(inputChannel="inputChannel",outputChannel = "redisChannel")
public Message<?> receiveFromService(Message<?> message)
{
	System.out.println("received from service");
	return message;
}
@ServiceActivator(inputChannel="redisChannel")
public void sendMessageToQueue(Message<?> message)
{
	RedisQueueOutboundChannelAdapter adapter=
			new RedisQueueOutboundChannelAdapter("Redis-queue",jedisconnectionFactory);
	adapter.handleMessage(message);
}
@ServiceActivator(inputChannel="receiverChannel")
public void receiveFromQueue(Message<?> message)
{
	System.out.println("received from reddis queue"+message);
}

}
