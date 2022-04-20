package com.company;

import java.io.File;
import java.io.*;
import java.util.regex.Matcher;
import  java.util.regex.Pattern;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите ip-адрес:");
        Scanner sc1 = new Scanner(System.in);
        String ip = sc1.nextLine();
        String input = ip;
        boolean result = input.matches("^((25[0-5]|2[4]\\d|[01]?\\d\\d?)\\.){3}(25[0-5]|2[4]\\d|[01]?\\d\\d?)$");
        if (result) {
            try (BufferedWriter pop = new BufferedWriter(new FileWriter("D://LOK.txt"))) {
                pop.write(ip);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }else {
            System.out.println("Error");
        }
    }
    }