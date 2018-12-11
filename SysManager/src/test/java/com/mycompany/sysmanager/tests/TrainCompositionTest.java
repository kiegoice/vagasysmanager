/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sysmanager.tests;

import com.mycompany.sysmanager.TrainComposition;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author DiegoFernando
 */
public class TrainCompositionTest {
    
    @Test
    public void testAddToTrain() {
        TrainComposition trem1 = new TrainComposition();
        assertEquals("[]", trem1.MostrarTrem());
        trem1.AtracarADireita(9);
        assertEquals("[9]", trem1.MostrarTrem());
        TrainComposition trem2 = new TrainComposition();
        assertEquals("[]", trem2.MostrarTrem());
        trem2.AtracarAEsquerda(6);
        assertEquals("[6]", trem2.MostrarTrem());
        trem1.AtracarADireita(4);
        assertEquals("[9, 4]", trem1.MostrarTrem());
        trem2.AtracarAEsquerda(11);
        assertEquals("[11, 6]", trem2.MostrarTrem());
    }
    
    @Test
    public void testRemoveFromTrain() {
        TrainComposition trem1 = new TrainComposition();
        assertEquals("[]", trem1.MostrarTrem());
        trem1.DesatracarADireita();
        assertEquals("[]", trem1.MostrarTrem());
        trem1.DesatracarAEsquerda();
        assertEquals("[]", trem1.MostrarTrem());
        trem1.AtracarADireita(1);
        trem1.AtracarADireita(2);
        trem1.AtracarADireita(3);
        assertEquals("[1, 2, 3]", trem1.MostrarTrem());
        trem1.DesatracarADireita();
        assertEquals("[1, 2]", trem1.MostrarTrem());
        trem1.DesatracarAEsquerda();
        assertEquals("[2]", trem1.MostrarTrem());
    }
    
}
