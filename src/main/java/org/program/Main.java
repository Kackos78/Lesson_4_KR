package org.program;

import java.io.IOException;

//Олейник Даниил Николаевич 02.11.1998 89288815770 m
public class Main {
    public static void main(String[] args) throws IOException {
    PersonalData personalData = new PersonalData();
        System.out.println(personalData.getDate());
        System.out.println(personalData.getFio());
        System.out.println(personalData.getGender());
        System.out.println(personalData.getNumber());

        WriteToFile writeToFile = new WriteToFile(personalData.getFio().get(0));

    }
}
