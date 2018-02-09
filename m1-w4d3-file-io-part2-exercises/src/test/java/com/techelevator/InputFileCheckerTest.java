package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InputFileCheckerTest {

    InputFileChecker inputFileChecker;

    @Before
    public void setup() {
    inputFileChecker = new InputFileChecker();

}

    @Test
    public void getLineCountFromFile() {

    }

    @Test
    public void getfileArraySize() {
//        inputFileChecker.setTotalLinesFromInputFile(334);


        Assert.assertEquals(4, inputFileChecker.getNumberOfFilesToBuild(334, 100));
    }
}