package com.cloud.controller.kafka.demo;

import java.util.Properties;

/** 
  * ClassName: aaa
  * Function: TODO
  * Description: TODO
  * date: 2019年1月8日 下午1:27:53 
  * 
  * @author liubin
  * @email aguai_liu@163.com
  * @version  
  * @since JDK 1.8
*/
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

/**
 * Kafka生产者Demo
 */
public class KafkaProducerDemo {

    public static void main(String[] args) {
        Properties props = new Properties();

        // 服务器ip:端口号，集群用逗号分隔
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        // key序列化指定类
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        // value序列化指定类
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());

        // 生产者对象
        KafkaProducer<String, String> producer = new KafkaProducer<>(props);

        // 向test_topic发送hello, kafka
        producer.send(new ProducerRecord<String, String>("test_topic", "hello, kafka1111"));
        producer.close();
    }


}