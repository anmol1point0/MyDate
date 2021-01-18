package com.MyDate.Profile;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class myProfile {
    private double height;
    enum Exercise{
        Active,
        Lazy
    } 
    private Exercise exercise;
    enum Education{
        Udergrad,
        Postgrad,
        High_School,
        Diploma
    } 
    private boolean Working;
    enum Alcohol{
        Regular,
        Social,
        Never,
        Neutral
    }
    private Alcohol alcohol;
    enum Smoking{
        Regular,
        Social,
        Never,
        Neutral
    }
    private Smoking smoking;
    enum Gender{
        Male,
        Female,
        Others
    }
    private Gender gender;
    enum Pets{
        I_Have,
        I_Dont_But_I_Want,
        I_Dont_Like_Them
    }
    private Pets pets;
    enum Clubbing{
        Regular,
        Social,
        Never,
        Neutral
    }
}
