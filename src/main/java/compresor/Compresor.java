package compresor;

public interface Compresor<T> {

    T compress (String sms);
    T uncompress(String message);
}
