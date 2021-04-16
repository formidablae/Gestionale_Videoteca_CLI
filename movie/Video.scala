package movie

import user.Utente;
import exceptions.VideoNonInCasaException

/* Uso classe astratta per l'inheritance di campi e metodi */
abstract class Video(var titolo: String,
                     var regista: String,
                     var anno: Int,
                     protected var prestatoA: Utente) /* Uso protected per l'information hiding e security */
                     extends Ordered[Video] { /* Implemento Ordered[Video] (l'analogo di Comparable<Video> di Java) */
  
  /* Faccio overloading del costruttore quando esso viene invocato senza prestatoA */
  def this(titolo: String,
           regista: String,
           anno: Int) = this(titolo, regista, anno, null);
	
  /* Lancio una eccezione VideoNonInCasaException quando si cerca di dare in prestito un video che e gia in prestito. */
  def prestaA(u: Utente): Unit = {
	  if (prestatoA != null) {
			throw new VideoNonInCasaException();
		}
		prestatoA = u;
	}
  
  /* Getter */
  def getTitolo(): String = {
    return titolo;
  }
  
  /* Getter */
  def vidPrestatoA(): Utente = {
    return prestatoA;
  }
  
  /* Implemento il metodo di comparazione secondo l'anno di questo Video con un altro */
	def compare(o: Video): Int = {
	  return this.anno - o.anno;
	}
	
	/* Faccio overriding del metodo toString() */
	override def toString(): String = {
	  return titolo + " di " + regista + " del " + anno;
	}
}