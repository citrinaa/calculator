package com.example.lab2;

import android.widget.TextView;

public class Calculate {

    public static int words (String text){

        text = text.replace("\n"," ");
        String[] textArray = text.split(" ");
        return textArray.length;
    }
    public static int chars(String text){

        int charCount = 0;
        char temp;

        for( int i = 0; i < text.length( ); i++ )
        {
            temp = text.charAt(i);

            if(Character.isLetter(temp))
                charCount++;
        }
        return charCount;
    }


}
