package org.example.dataTRansformation.filter;

import org.apache.flink.api.common.functions.FilterFunction;

public class myFilter implements FilterFunction<String> {

    @Override
    public boolean filter(String s) throws Exception {
        return s.startsWith("t");
    }
}
