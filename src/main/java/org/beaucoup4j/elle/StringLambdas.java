package org.beaucoup4j.elle;

public class StringLambdas {

    public static UnaryFunction<String, String> reverse() {
        return (s) -> new StringBuilder(s).reverse().toString();
    }

    public static Function<String> empty() {
        return () -> "";
    }
}
