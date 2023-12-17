package org.program;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    File file;
    public WriteToFile(String nameOfFile) {
        this.file = new File(nameOfFile);
        boolean newFile = false;
        try {
            newFile = this.file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(newFile) System.out.println("Создан новый файл");
        else System.out.println("Запись с существующий файл");
    }
    public void recording(PersonalData personalData){
        try (FileWriter fileWriter = new FileWriter(file);){
            fileWriter.write(String.valueOf(personalData.getFio()) + " ");

            fileWriter.write(personalData.getDate()+ " ");
            fileWriter.write(String.valueOf(personalData.getNumber())+ " ");
            fileWriter.write(personalData.getGender()+ " ");
        } catch (IOException e) {throw new RuntimeException(e);}

    }
}
