package com.capgemini.animals.model;

import org.junit.Assert;
import org.junit.Test;

public class AnimalTest {

    private Animal animal;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testSetAndGetForNumberOfLegs() {
        this.animal = new Animal();
        this.animal.setNumberOfLegs(10);
        int actual = this.animal.getNumberOfLegs();
        Assert.assertEquals(10, actual);

    }

    @Test
    public void testSetAndGetForName () {
        this.animal = new Animal();
        this.animal.setName("spot");
        String actual = this.animal.getName();
        Assert.assertEquals("spot", actual);

    }
}
