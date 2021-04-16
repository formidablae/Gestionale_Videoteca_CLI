package shop

import movie.Video;
import user._;

/* Class con var argomenti del costruttore. Implementa il trait/l'interfaccia VideotecheTrait. */
class Videoteca(var listaFilm: List[Video], var listaUtenti: List[Utente]) extends VideotecheTrait {
  
  /* Faccio una fusione di un elemento con una lista mutabile/immutabile */
  def insertVideo(v: Video): Unit = {
    listaFilm = v :: listaFilm;
  }
  
  /* Incremento un contatore globale di un'istanza singleton object */
  def inserisciUtente(u: Utente): Unit = {
    listaUtenti = u :: listaUtenti;
    ContoUtenti.incrementaContoUtenti();
  }
  
  /* Uso for */
  def prestaA(v: Video, utenteID: Int): Unit = {
    for(u: Utente <- listaUtenti){
			if (u.getID() == utenteID){
				v.prestaA(u);
				return;
			}
		}
		println("Utente non trovato");
  }
  
  /* Uso foreach */
  def printVideo(): Unit = {listaFilm.foreach(println);}
  
  /* Uso foreach */
  def printUtenti(): Unit = {listaUtenti.foreach(println);}
  
  /* Uso filter */
  def prestitiAttiviToString(): List[String] = {
    return prestitiStatusToString().filter(text => !text.contains("non"));
  }
  
  /* Uso map */
  def prestitiStatusToString(): List[String] = {
    return listaFilm.map(v =>
      if(v.vidPrestatoA() == null) v.getTitolo() + " non prestato"
      else v.getTitolo() + " prestato a: " + v.vidPrestatoA().getNome()
    );
  }
  
  /* Stampo elenco prestiti (solo attivi) */
  def printPrestiti(): Unit = {
    prestitiAttiviToString().foreach(println);
  }
  
  /* Stampo status prestiti (anche non prestati) */
  def printStatus(): Unit = {
    prestitiStatusToString().foreach(println);
  }
  
}