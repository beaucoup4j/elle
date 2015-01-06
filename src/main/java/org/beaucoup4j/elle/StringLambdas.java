package org.beaucoup4j.elle;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StringLambdas {
//----------------------------------------------------------------------------------------------------------------------
// Static Methods
//----------------------------------------------------------------------------------------------------------------------

    public static Supplier<String> empty() {
        return () -> "";
    }

    public static Predicate<String> isEmpty() {
        return (s) -> s == null || s.isEmpty();
    }

    public static Function<String, String> reverse() {
        return (s) -> s == null ? null : new StringBuilder(s).reverse().toString();
    }

//----------------------------------------------------------------------------------------------------------------------
// Constructors
//----------------------------------------------------------------------------------------------------------------------

    private StringLambdas() {

    }
}
