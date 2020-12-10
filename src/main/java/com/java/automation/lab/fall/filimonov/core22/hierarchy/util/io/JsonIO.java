package com.java.automation.lab.fall.filimonov.core22.hierarchy.util.io;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.*;

public class JsonIO<T> {
    private Class<T> clasz;
    private final static Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public JsonIO(Class<T> clasz) {
        this.clasz = clasz;
    }

    public void write(T obj, String pathTo) throws IOException {
        Writer writer = new FileWriter(pathTo);
        GSON.toJson(obj, writer);
        writer.flush();
        writer.close();
    }

    public T read(String pathTo) throws IOException {
        return (T) GSON.fromJson(new FileReader(pathTo), clasz);
    }
}
