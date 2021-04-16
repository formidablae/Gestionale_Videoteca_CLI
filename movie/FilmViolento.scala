package movie;

import user.Utente;
import exceptions.VideoNonAdattoException;

/* Faccio uso di una superclasse Video per definire una sottoclasse FilmPerTutti */
class FilmViolento(titolo: String,
                   regista: String,
                   anno: Int) extends Video(titolo, regista, anno) {

  /* Lancio una eccezione VideoNonAdattoException quando si cerca di dare in prestito un video non addatto ad un minorenne. */
	override def prestaA(u: Utente): Unit = {
		if (u.isMaggiorenne()) super.prestaA(u);
		else throw new VideoNonAdattoException();
	}
	
	/* Faccio overriding del metodo toString() della superclasse */
	override def toString(): String = {
	  return "Film violento: " + super.toString();
	}
}
