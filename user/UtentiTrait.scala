package user

trait UtentiTrait {
  def nome: String;
  def id: Int;
  def eta: Int;
  
  def isMaggiorenne(): Boolean;
  def getID(): Int;
}