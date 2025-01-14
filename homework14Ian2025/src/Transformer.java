package homework04;

@FunctionalInterface
interface Transformer<T> {
    T transform(T input);
}