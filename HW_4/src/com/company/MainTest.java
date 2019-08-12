package com.company;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class MainTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(Main.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }
    Float one = 4.0f;
    Float two = 7.1f;

    @Test
    public void range() {
        assertFalse(two <= 5.0 && two >= -5.0);
    }

    @Test
    public void maxValue() {
        assertTrue(two > one);
    }

    @Test
    public void minValue() {
        assertFalse(two > one);
    }
}
