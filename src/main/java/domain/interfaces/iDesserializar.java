package domain.interfaces;

public interface iDesserializar {
    <T> T dataConverter(String json, Class<T> classe);
}
