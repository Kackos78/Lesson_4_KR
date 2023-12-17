package org.program;

import java.util.ArrayList;

public class PersonalData {
    public String getGender() {return gender;}

    public long getNumber() {return number;}

    public String getDate() {return date;}

    public ArrayList<String> getFio() {return fio;}

    private String gender;
    private long number;
    private String date;
    private ArrayList<String> fio;
    public PersonalData() {
        FillPersonalData data = new FillPersonalData();
        this.gender = data.putGender();
        this.number = data.putNumber();
        this.date = data.putDate();
        this.fio = data.putFIO();
    }
}
