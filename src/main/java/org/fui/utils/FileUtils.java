package org.fui.utils;

import java.io.File;
import java.security.InvalidParameterException;

public class FileUtils {

    public static void ensurePath(String path) throws InvalidParameterException {
        File file = new File(path);
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            throw new InvalidParameterException("不是目录:" + file.getAbsolutePath());
        }
    }
}
