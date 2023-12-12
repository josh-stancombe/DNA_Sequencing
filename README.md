# DNA_Sequencing
Java Codecademy Project

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
    - "ATTAATATGTACTGA"

Codecademy - "String Methods Project" <br>
URL: https://www.codecademy.com/courses/learn-java/projects/java-dna-sequencing
