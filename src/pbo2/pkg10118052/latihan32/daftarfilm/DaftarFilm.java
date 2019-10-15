/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan32.daftarfilm;

/**
 *
 * @author
 * NAMA     : Bagus Syibro Malisi
 * KELAS    : IF-2
 * NIM      : 10118052
 * Deskripsi Program : Membuat program untuk menampilkan daftar film
 * berbasis object
 */
public class DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("===Daftar Film Sedang Tayang===\n");
        
        Film film = new Film();
        
        film.filmName = "Venom";
        film.filmGenre = "Action, Horror, Scifi";
        film.filmRating = 8.5;
        film.filmDuration = 120;
        film.nowPlaying();
        
        film.filmName = "Small Foot";
        film.filmGenre = "Animation";
        film.filmRating = 9;
        film.filmDuration = 96;
        film.nowPlaying();
        
        film.filmName = "Crazy Rich Asian";
        film.filmGenre = "Comedy";
        film.filmRating = 7.8;
        film.filmDuration = 119;
        film.nowPlaying();
        
        film.filmName = "Asih";
        film.filmGenre = "Horror";
        film.filmRating = 6;
        film.filmDuration = 100;
        film.nowPlaying();
     
    }
    
}
