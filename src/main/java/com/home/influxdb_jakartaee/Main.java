package com.home.influxdb_jakartaee;

import com.influxdb.client.InfluxDBClient;
import com.influxdb.client.InfluxDBClientFactory;
import com.influxdb.client.WriteApiBlocking;
import com.influxdb.client.domain.WritePrecision;


public class Main {
    public static void main(String[] args) {
        String token = "RUXPV_jFmEwE2mjzkkYwoijaZCk4cKnKBZI_FPh-R48hoAvxBzfn571ruO4DmQtUMQeXiL7udWPlN-gbDdNsSw==";
        String bucket = "bucket";
        String org = "org";

        InfluxDBClient client = InfluxDBClientFactory.create("http://localhost:8086", token.toCharArray());

        Person person = new Person();
        person.setId(1L);
        person.setName("ali");
        person.setFamily("rad");

        WriteApiBlocking writeApi = client.getWriteApiBlocking();
        writeApi.writeMeasurement(bucket, org, WritePrecision.NS, person);


//        System.out.println("Ping +: "+client.ping());
//        System.out.println("Connected");
//
//        System.out.println(client.getBucketsApi());
//
//        client.close();
//        System.out.println("Client.close() - Disconnected");


//        Entity Saving process
//        Person person = new Person();
//        person.setId(1L);
//        person.setName("ali");
//        person.setFamily("rad");
//
//        WriteApiBlocking writeApi = client.getWriteApiBlocking();
//        writeApi.writeMeasurement(bucket,org, WritePrecision.NS,person);

    }
}
