package org.example;

public class Part1 {
    public String findSimpleGene(String dna){
        int start = dna.indexOf("atg");
        if (start == -1) {
            return "";
        }
        int stop = dna.indexOf("tag", start+3);
        if ((stop - start) % 3 == 0) {
            return dna.substring(start, stop+3);
        }
        else {
            return "";
        }
    }

    public String testSimpleGene(String dna){
        return findSimpleGene(dna);
    }
}
