package org.program;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
    PersonalData personalData = new PersonalData();
    WriteToFile writeToFile = new WriteToFile(personalData.getFio().get(0));
    writeToFile.recording(personalData);
    }
}
