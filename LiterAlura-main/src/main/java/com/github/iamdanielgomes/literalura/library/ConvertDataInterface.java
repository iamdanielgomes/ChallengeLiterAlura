package com.github.iamdanielgomes.literalura.library;

public interface ConvertDataInterface {
    <T> T toGetData(String json, Class<T> myClass);
}
