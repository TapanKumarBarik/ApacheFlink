package org.example.dataTRansformation.filter;

import org.apache.flink.api.common.functions.FilterFunction;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.nio.file.Path;
import java.util.stream.Stream;

public class FilterNames {
    public static void main(String[] args) throws Exception {

        //Created a Stream execuation environment
        StreamExecutionEnvironment env=StreamExecutionEnvironment.getExecutionEnvironment();

        //Read text file from a path
        DataStream<String>ds=env.readTextFile("C:\\Development\\ApacheFlink\\learningFlink\\src\\main\\java\\org\\example\\dataTRansformation\\filter\\names.txt");

        //Filter return string
        DataStream<String>dsFiltered=ds.filter(new myFilter());


        //Print the filtered string
        //dsFiltered.print();

        //Map , map words and create Tuple2
        DataStream<Tuple2<String,Integer>> ds3=dsFiltered.map(new Tokenizer());

        //print the map words
        //ds3.print();


        //Flat map

        DataStream<Tuple2<String,Integer>>ds4=ds.flatMap(new MyFlatMap());

        ds4.print();
        //ds.print();

        env.execute();
    }

}
