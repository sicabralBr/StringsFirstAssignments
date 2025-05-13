package org.example;

public class Part2 {
    public String findSimpleGene(String dna){
        String response = "";
        int startCodon = dna.indexOf("atg");
        if (startCodon == -1) {
            return "";
        }
        int stopCodon = dna.indexOf("tag", startCodon+3);
        if ((stopCodon - startCodon) % 3 == 0) {
            if (dna.equals(dna.toUpperCase())) {
                response = dna.substring(startCodon, stopCodon+3).toLowerCase();
            } else if (dna.equals(dna.toLowerCase())) {
                response = dna.substring(startCodon, stopCodon+3).toUpperCase();
            }
        }
        else {
            return "";
        }

        return response;
    }

    public String testSimpleGene(String dna){
        return findSimpleGene(dna);
    }
}
