package prova

import movie._; /* importazione da altri packages */
import user._;
import shop.Videoteca;

/* Singleton object instance */
object Programma {
  
  /* Il main() */
  def main(args: Array[String]) {
    
    /* Creo due liste vuote, una di utenti e l'altra di Video. */
    println("Creo due liste vuote, una di utenti e l'altra di Video.");
    val listaUtenti = List[Utente]();
    val listaFilm = List[Video]();
    
    /* Costruisco un oggetto videoteca con le due liste fornite come parametri */
    println("Costruisco un oggetto videoteca con le due liste fornite come parametri.");
		val vt = new Videoteca(listaFilm, listaUtenti);
		
    /* Creo alcuni FilmPerTutti */
    println("Creo alcuni FilmPerTutti.");
		val vidfpt1 = new FilmPerTutti("Passo del", "Nds", 1956);
		val vidfpt2 = new FilmPerTutti("Inception", "Abs", 2010);
		val vidfpt3 = new FilmPerTutti("Hello Wrd", "Bse", 2015);
		
		/* Creo alcuni Documentari */
    println("Creo alcuni Documentari");
		val viddoc1 = new Documentario("Pianeta T", "xyz", TipiDocumentari.NATURA, 2001);
		val viddoc2 = new Documentario("Prehistor", "nmh", TipiDocumentari.STORIA, 2007);
		val viddoc3 = new Documentario("Mega Fabb", "sdz", TipiDocumentari.ATTIVITAUMANE, 2013);
		
    /* Creo un FilmViolento */
    println("Creo un FilmViolento");
		val vidviol = new FilmViolento("Kill bill", "hey", 2004);
		
		/* Creo alcuni Utenti di diverse eta */
    println("Creo alcuni Utenti di diverse eta\n");
		val usr1 = new Utente("Andre", 1, 21);
		val usr2 = new Utente("Marco", 2, 16);
		val usr3 = new Utente("Dario", 3, 23);
		
		/* Inserisco i Video/Film/Documentari in Videoteca */
    println("Inserisco i Video/Film/Documentari in Videoteca.");
		vt.insertVideo(vidfpt1);
		vt.insertVideo(vidfpt2);
		vt.insertVideo(vidfpt3);
		vt.insertVideo(viddoc1);
		vt.insertVideo(viddoc2);
		vt.insertVideo(viddoc3);
		vt.insertVideo(vidviol);
		
		/* Inserisco gli utenti in Videoteca */
    println("Inserisco gli utenti in Videoteca.\n");
		vt.inserisciUtente(usr1);
		vt.inserisciUtente(usr2);
		vt.inserisciUtente(usr3);
		
		/* Stampo i video della Videoteca */
    println("Stampo i video della Videoteca.");
		vt.printVideo();
	  /* Stampo gli utenti della Videoteca */
    println("\nStampo gli utenti della Videoteca.");
		vt.printUtenti();
		
	  /* Stampo il numero degli utenti della Videoteca */
    println("\nStampo il numero degli utenti della Videoteca.");
		println("Numero utenti: " + ContoUtenti.getNumeroUtenti());
		
	  /* Verifico quali utenti siano maggiorenni */
    println("\nVerifico quali utenti siano maggiorenni.");
		println("usr1 e maggiorenne? " + usr1.isMaggiorenne());
		println("usr2 e maggiorenne? " + usr2.isMaggiorenne());
		println("usr3 e maggiorenne? " + usr3.isMaggiorenne());
		
	  /* Faccio delle comparazioni delle eta tra utenti */
    println("\nFaccio delle comparazioni delle eta tra utenti.");
		println("Comparazione eta di usr1 con l'eta di usr2: " + usr1.compare(usr2));
		println("Comparazione eta di usr2 con l'eta di usr3: " + usr2.compare(usr3));
	  
		/* Faccio delle comparazioni degli anni dei video */
    println("\nFaccio delle comparazioni degli anni dei video.");
		println("Comparazione anno di vidfpt2 con l'anno di viddoc1: " + vidfpt2.compare(viddoc1));
		println("Comparazione anno di vidfpt1 con l'anno di vidviol: " + vidfpt1.compare(vidviol));
		
		/* Presto alcuni video ad alcuni utenti */
    println("\nPresto alcuni video ad alcuni utenti.");
		vidfpt1.prestaA(usr1);
//  vidfpt1.prestaA(usr2); // Lancio un'eccezione VideoNonInCasaException perche il film e gia prestato a usr1.
		vidfpt2.prestaA(usr2);
		vidfpt3.prestaA(usr3);
		viddoc1.prestaA(usr2);
		viddoc3.prestaA(usr1);
//	vidviol.prestaA(usr2); // Lancio un'eccezione VideoNonAdattoException perche il film e violento e usr2 non e maggiorenne.
		vidviol.prestaA(usr3);
		
		/* Stampo i prestiti attivi */
    println("\nStampo solo i prestiti attivi.");
		vt.printPrestiti();
		
		/* Stampo tutto, anche video non in prestito */
    println("\nStampo tutto, anche video non in prestito attualmente.");
		vt.printStatus();
	}
}