package org.examle.com.expl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Creator1 {

  static String creat (){


    Path p = Paths.get("texx.html");
    Path niw;

    {
        try {
            niw = Files.createFile(p);
        } catch (IOException e) {
           return "не удалось";
        }
    }
    return niw.toAbsolutePath().toString();
}

}
