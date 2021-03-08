package com.knoldus;

import java.util.Scanner;

@FunctionalInterface
public interface Production {
    long getRange(long leftBorder, long rightBorder);
}

