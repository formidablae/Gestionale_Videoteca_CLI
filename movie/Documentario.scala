package movie;

/* Faccio uso di una superclasse Video per definire una sottoclasse Documentario con argomenti aggiuntivi */
class Documentario(titolo: String,
			             regista: String,
				           tema: TipiDocumentari.Value, /* Uso enumeration */
			             anno: Int) extends Video(titolo, regista, anno) {
	
  /* Faccio overriding del metodo toString() della superclasse */
	override def toString(): String = {
		return "Documentario: " + super.toString() + ". Tema: " + tema;
	}
}