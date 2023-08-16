package org.example.DataStream;

import org.apache.flink.api.common.functions.FilterFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class WordCountStreaming {
    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env=StreamExecutionEnvironment.getExecutionEnvironment();
        DataStream<String>ds=env.socketTextStream("localhost",8000);

        DataStream<String>filteredData=ds.filter(new myFilter()) ;

        // MAP
        DataStream<Tuple2<String,Integer>>tupledData=filteredData.map(new myMapFunction());

        DataStream<Tuple2<String,Integer>>finalOP=tupledData.keyBy(0).sum(1);

        finalOP.print();

        env.execute();
    }
}
