/*

 - DNA Sequencing -

 -. .-.   .-. .-.   .
   \   \ /   \   \ / 
  / \   \   / \   \  
 ~   `-~ `-`   `-~ `-

The genome of an organism stores genetic information necessary to build and maintain that organism. DNA contains a series of nucleotides abbreviated as:

    A: Adenine
    C: Cytosine
    G: Guanine
    T: Thymine

A sample sequence from DNA could look something like ATGAATTGA. A group of three nucleotides is called a codon. Codons determine which amino acids will be used to make peptides and proteins.

Write a DNA.java program that determines whether there is a sequence that encodes a peptide in a strand of DNA. A valid sequence has the following qualities:

    - It begins with a “start codon”. For our purposes, use ATG.
    - It ends with a “stop codon”. For our purposes, use TGA.
    - In between, each additional codon is a sequence of three nucleotides.

So for example:

    - ATGCGATACTGA is a valid sequence because it has the start codon ATG, the stop codon TGA, and the length is divisible by 3.

    - ATGCGATAGA is not a valid sequence because the length is not divisible by 3, so the third condition is not satisfied.

Here are the three sequences that you are going to use to test your program:

    - "ATGCGATACGCTTGA"
    - "ATGCGATACGTGA"
    - "ATGAATATGTACTGA"

Codecademy "String Methods Project"
URL: https://www.codecademy.com/courses/learn-java/projects/java-dna-sequencing

*/

public class DNA {
 
  public static void main(String[] args) {
 
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATGAATATGTACTGA";

    peptideFinder(dna1);
    peptideFinder(dna2);
    peptideFinder(dna3);

  }

  public static void peptideFinder(String dna){

    System.out.println("DNA sample: " + dna);
    int dna_length = dna.length();
    
    System.out.println("- Length: " + dna_length);

    // Find index of ATG codon:
    int startInt = dna.indexOf("ATG");
    int endInt = dna.indexOf("TGA");
    int peptideLength = endInt - startInt;

    // Find Peptide:
    if (startInt != -1 && endInt != -1 && peptideLength % 3 == 0){
      String peptide = dna.substring(startInt, (startInt + 3));
      System.out.println("- Peptide: " + peptide + "\n");
    } else {
      System.out.println("- No Peptide Found \n");
    }
  }

}