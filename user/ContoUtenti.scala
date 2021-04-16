

package user

object ContoUtenti {
  private var numeroUtenti: Int = 0;
  
  def incrementaContoUtenti(): Unit = {
    numeroUtenti = numeroUtenti.+(1);
  }
  
  def getNumeroUtenti(): Int = {
    return numeroUtenti;
  }
}