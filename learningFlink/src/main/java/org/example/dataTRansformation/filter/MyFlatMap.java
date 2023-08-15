package org.example.dataTRansformation.filter;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;

public class MyFlatMap implements FlatMapFunction<String, Tuple2<String,Integer>> {
    @Override
    public void flatMap(String s, Collector<Tuple2<String, Integer>> collector) throws Exception {

        String[]arr=s.split(" ");

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i].length()>0){
                collector.collect(new Tuple2<String,Integer>(arr[i],1));
            }
        }
    }
}
