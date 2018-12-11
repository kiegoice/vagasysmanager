/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sysmanager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DiegoFernando
 */
public class TrainComposition {

    private List<Integer> trainComposition;

    public TrainComposition() {
        trainComposition = new ArrayList();
    }

    public void AtracarAEsquerda(Integer vagao) {
        trainComposition.add(0, vagao);
    }

    public void AtracarADireita(Integer vagao) {
        trainComposition.add(vagao);
    }

    public Integer DesatracarAEsquerda() {
        if (trainComposition.size() > 0) {
            return trainComposition.remove(0);
        } else {
            return null;
        }
    }

    public Integer DesatracarADireita() {
        if (trainComposition.size() > 0) {
            return trainComposition.remove(trainComposition.size() - 1);
        } else {
            return null;
        }
    }
    
    public String MostrarTrem() {
        return trainComposition.toString();
    }

}

