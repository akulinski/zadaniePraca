package com.example.zadaniePraca;

import java.security.SecureRandom;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.sql.Time;
import java.util.Random;
import java.util.Timer;

public class RandomStringGenerator {




    private static RandomStringGenerator generator;
    private final SecureRandom random;
    private final String alphabet= "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";


    private RandomStringGenerator(){
        random=new SecureRandom();

    }

    public synchronized static RandomStringGenerator getInstance(){

        if(generator==null){
            generator=new RandomStringGenerator();
        }
        return generator;
    }

    public String getString(int len){
        StringBuilder stringBuilder=new StringBuilder();

        for(int i=0;i<len;i++){

            int randomNum=random.nextInt(alphabet.length());
            stringBuilder.append(alphabet.charAt(randomNum));

        }

        return stringBuilder.toString();
    }

}

