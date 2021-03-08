package com.knoldus;

import java.util.stream.LongStream;

public class ProductionOfNumbers implements Production {
    @Override
    public long getRange(long lb,long rb) {
        long getProduct = LongStream.rangeClosed(lb,rb).reduce(1,(low,high) -> low*high);
        return getProduct;
    }


}
