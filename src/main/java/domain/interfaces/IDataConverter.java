package domain.interfaces;

public interface IDataConverter {
    <T> T dataConverter(String json, Class<T> classe);
}
