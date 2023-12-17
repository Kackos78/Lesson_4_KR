package org.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FillPersonalData {
    public FillPersonalData() {
        this.array = scanner();
    }
    ArrayList<String> array = new ArrayList<>();
    private ArrayList<String> scanner() {
        System.out.print("Введите данные в одну строку, разделяя данные пробелом: ");
        Scanner scan = new Scanner(System.in);
        String[] arr = scan.nextLine().split(" ");
        Collections.addAll(array, arr);
        try {
            if (array.size() < 6){
                throw new RuntimeException();}
            if (array.size() > 6) {
                throw new ArrayIndexOutOfBoundsException();
            }
        }catch (ArrayIndexOutOfBoundsException e){
            throw new RuntimeException("Вы ввели лишние данные." +
                    " Пожалуйста введите данные по шаблону:" +
                    " Фамилия Имя Отчество датарождения" +
                    " номертелефона пол");
        }catch (RuntimeException e){
            throw new RuntimeException("Вы ввели мало данных." +
                " Пожалуйста введите данные по шаблону:" +
                " Фамилия Имя Отчество датарождения" +
                " номертелефона пол");}
        return array;
    }
    public String putGender(){
        String gender = null;
        for (String el: array) {
            if(el.equals("f") || el.equals("m")) gender = el;
        }
        if (gender == null) throw new RuntimeException("Пол введен не правильно, подалуйста введите пол в формате f/m");
        return gender;
    }
    public long putNumber() {
        long number = 0;
        for (String el : array) {
            try {
                    number = Long.parseLong(el);
                    if(number != 0)return number;
            } catch (NumberFormatException | NullPointerException ignore) {}
        }
        throw new RuntimeException("Номер телефона введен не правильно, подалуйста введите телефон в формате '8999887766'");

    }
    public String putDate(){
        String date = null;
        for (String el : array) {
            try {
                if (el.indexOf('.') == 2 && el.lastIndexOf('.') == 5) {
                    return el;
                }
            } catch (NullPointerException ignored) {}
        }
        throw new RuntimeException("Дата рождения введена не правильно, подалуйста введите дату рождения в формате dd.mm.yyyy");
    }
    public ArrayList<String> putFIO(){
        ArrayList<String> fioArr = new ArrayList<>();
        String gender = putGender();
        long number = putNumber();
        String date = putDate();
        for (String el: array) {
            if(!el.equals(gender) && !el.equals(Long.toString(number)) && !el.equals(date)){
                fioArr.add(el);
            }
        }
        return fioArr;
    }
}
