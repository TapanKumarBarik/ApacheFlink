package org.example.DataStream;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.tuple.Tuple2;

public class myMapFunction implements MapFunction<String, Tuple2<String,Integer>> {
    @Override
    public Tuple2<String, Integer> map(String s) throws Exception {
        return new Tuple2<String,Integer>(s,1);
    }
}
