package q2;

import java.util.function.Function;

@FunctionalInterface
public interface Check {
    Function<String, Boolean> check();
}
