package movie

/* Faccio uso di una superclasse Video per definire una sottoclasse FilmPerTutti */
class FilmPerTutti(titolo: String,
                   regista: String,
                   anno: Int) extends Video(titolo, regista, anno) {
  
  /* Faccio overriding del metodo toString() della superclasse */
  override def toString(): String = {
	  return "Film per tutti: " + super.toString();
	}
}