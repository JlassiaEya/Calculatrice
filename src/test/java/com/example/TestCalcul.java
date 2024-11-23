package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TestCalcul {
 /**
     * testAdditionner.
     * @param a first operand
     * @param b second operand
     * @return the sum of a and b
     */
    @Test
    void testAdditionner() {
        Calcul calculatrice = new Calcul();
        
        int result = calculatrice.additionner(2, 3);
        
        assertEquals(5, result, "L'addition de 2 et 3 devrait être 5");
    }
 /**
     * Test the multiply method of Calcul.
     * @param a first operand
     * @param b second operand
     * @return the product of a and b
     */
    @Test
    void testMultiplier() {
        Calcul calculatrice = new Calcul();
        
        int result = calculatrice.multiplier(2, 3);
        
        assertEquals(6, result, "La multiplication de 2 et 3 devrait être 6");
    }
}
