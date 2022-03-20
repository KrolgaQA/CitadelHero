package com.epam.homework1;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        HomeWork1 homeWork1 = new HomeWork1();

        int fibonachchiResult = homeWork1.fibonachchi(10);
        logger.log(Level.INFO, "Number = {0}", fibonachchiResult);

        int fibonachchiRecursionResult = homeWork1.fibonachchiRecursion(10);
        logger.log(Level.INFO, "Number = {0}", fibonachchiRecursionResult);

        String s = homeWork1.divMod(65, 6);
        logger.info(s);

        String s1 = homeWork1.fuzzBuzz(-6);
        logger.info(s1);

        boolean b = homeWork1.isPalindrome(0);
        logger.info("Is polindrome " + b);

        int[] res= homeWork1.twoSum(new int[]{3,5,4,5},10);
        logger.info(Arrays.toString(res));

        int sqrtResult = homeWork1.mySqrt(12);
        logger.info("Result is " + sqrtResult);

        int lastWordLength = homeWork1.lengthOfLastWord("   fly me   to   the    moon    ");
        logger.info("Length is " + lastWordLength);
    }
}
