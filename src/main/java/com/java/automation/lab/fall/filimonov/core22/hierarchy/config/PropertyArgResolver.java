package com.java.automation.lab.fall.filimonov.core22.hierarchy.config;

import com.java.automation.lab.fall.filimonov.core22.hierarchy.constant.IOConstant;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyArgResolver {
    private Properties props;

    private static PropertyArgResolver instance;

    public static PropertyArgResolver getInstance() throws Exception {
        if (instance == null) {
            synchronized (PropertyArgResolver.class) {
                if (instance == null) {
                    instance = new PropertyArgResolver();
                }
            }
        }
        return instance;
    }

    private PropertyArgResolver() throws Exception {
        this.props = new Properties();
        try {
            if (!IOConstant.CONFIG_PATH.endsWith(".properties")) {
                throw new Exception("Provide the config file in proper format");
            }
            InputStream inputStream = new FileInputStream(new File(IOConstant.CONFIG_PATH).getAbsolutePath());
            this.props.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new Exception("");
        }
    }

    public String get(String key) {
        return this.props.getProperty(key);
    }
}
