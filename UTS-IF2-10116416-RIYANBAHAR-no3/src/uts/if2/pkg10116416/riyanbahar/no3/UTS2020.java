/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if2.pkg10116416.riyanbahar.no3;

/**
 *
 * @author 
 * NAMA     : RIYAN BAHAR
 * KELAS    : IF2
 * NIM      : 10116416
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

public class UTS2020 {
    public static void main(String[] args) {
        
        Rnb blues = new Rnb();
        blues.genreBlues("Jimmy Hendrik");
        
        Rnb jazz = new Rnb();
        jazz.genreJazz("Chad Baker");
        
        Folk folk = new Folk();
        folk.genreFolk("Bob Dylan");
        
        Rockability rockability = new Rockability();
        rockability.genreRockability("Elvis Presley");
        
        HardRock progressiveRock = new HardRock();
        progressiveRock.genreProgressiveRock("DreamTheater");
        
        HardRock psycehedellic = new HardRock();
        psycehedellic.genrePsycehedellic("The Doors");
        
        HardRock popRock = new HardRock();
        popRock.genrePopRock("Kiss");
        
        Metal punk = new Metal();
        punk.genrePunk("MXPX");
        
        Metal heavyMetal = new Metal();
        heavyMetal.genreHeavyMetal("METALLICA");
        
        Grindcore grindcore = new Grindcore();
        grindcore.genreGrindcore("Mesin Tempur");
        
        DeathMetal deathMetal = new DeathMetal();
        deathMetal.genreDeathMetal("JASAD");
        
        DeathCoreKepiting deathCoreKepiting = new DeathCoreKepiting();
        deathCoreKepiting.genreDeathCoreKepiting("Revenge The Fate");
        
        BlackMetal blackMetal = new BlackMetal();
        blackMetal.genreBlackMetal("Behemoth");
        
        NewSkul newSkul = new NewSkul();
        newSkul.genreNewSkul("HATEBREED");
    }
}
