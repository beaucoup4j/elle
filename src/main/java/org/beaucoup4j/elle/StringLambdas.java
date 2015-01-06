package org.beaucoup4j.elle;

import java.util.function.Function;
import java.util.function.Supplier;

public class StringLambdas {

    public static Function<String, String> reverse() {
        return (s) -> new StringBuilder(s).reverse().toString();
    }

    public static Supplier<String> empty() {
        return () -> "";
    }
}
