package ch19_generic;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseDate<T> {
    private String message;
    private T data;

    @Override
    public String toString() {
        return message + data;
    }
}
