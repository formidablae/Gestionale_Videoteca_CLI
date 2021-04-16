package user

/* Classe Utente implementa il trait/l'interfaccia UtentiTrait e Ordered[Utente] (Comparable<Utente>) */
class Utente(var nome: String, var id: Int, var eta: Int) extends UtentiTrait with Ordered[Utente] {
  
  /* Getter */
  def getNome(): String = {
    return nome;
  }
  
  /* Verifica dell'eta */
  def isMaggiorenne(): Boolean = {
    return eta >= 18;
  }
  
  /* Getter */
  def getID(): Int = {
    return id;
  }
  
  /* Implemento il metodo di comparazione secondo l'eta di questo Utente con un altro */
  def compare(u: Utente): Int = {
    return this.eta - u.eta;
  }
  
  /* Faccio overriding del metodo toString() della superclasse */
	override def toString(): String = {
	  return "Utente: " + nome + ", id: " + id + ", eta: " + eta;
	}
}