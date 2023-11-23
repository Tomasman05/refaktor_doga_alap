/*
 * File: CalcController.java
 * Created Date: 2020-09-15
 * Author: Nagy János
 * Github: https://github.com/Tomasman05
 * Copyright (c) 2020-2022 Nagy János
 * refaktor: Vitovszki Tamás
 * GNU GPL v2
 */

package controllers;


public class CalcController {
    
    public static double calcPerimeter( double aSide, double bSide) {
        return aSide + bSide; 
    } 

    public static double calcArea(double aSide, double bSide) {
        return aSide * bSide;
    }
}
