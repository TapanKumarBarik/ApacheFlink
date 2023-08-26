package org.example.DataStream;

import org.apache.flink.api.common.functions.FilterFunction;

public class myFilter implements FilterFunction<String> {

    @Override
    public boolean filter(String s) throws Exception {
        return s.startsWith("T") || s.startsWith("S");
    }
}
