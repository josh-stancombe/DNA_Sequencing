# DNA_Sequencing
Java Codecademy Project

The genome of an organism stores all the genetic information necessary to build and maintain that organism. It is an organism’s complete set of DNA. DNA is composed of a series of nucleotides abbreviated as:

    A: Adenine
    C: Cytosine
    G: Guanine
    T: Thymine

So a strand of DNA could look something like ACGAATTCCG.

Write a DNA.java program that determines whether there is a protein in a strand of DNA. A protein has the following qualities:

    - It begins with a “start codon”: ATG.
    - It ends with a “stop codon”: TGA.
    - In between, each additional codon is a sequence of three nucleotides.

So for example:

    - ATGCGATACTGA is a protein because it has the start codon ATG, the stop codon TGA, and the length is divisible by 3.

    - ATGCGATAGA is not a protein because the sequence length is not divisible by 3, so the third condition is not satisfied.

Here are the three DNA strands that you are going to use to test your program:

    - "ATGCGATACGCTTGA"
    - "ATGCGATACGTGA"
    - "ATTAATATGTACTGA"

Codecademy - "String Methods Project" <br>
URL: https://www.codecademy.com/courses/learn-java/projects/java-dna-sequencing
