package shop

import user.Utente;
import movie.Video;

/* Definizione di un trait/interfaccia */
trait VideotecheTrait {
  def listaFilm: List[Video];
  def listaUtenti: List[Utente];
  
  def inserisciUtente(u: Utente);
  def insertVideo(v: Video);
  def prestaA(v: Video, utenteID: Int);
  def printVideo();
}