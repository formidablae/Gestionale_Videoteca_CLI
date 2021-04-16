package exceptions

/* Definizione di una custom ecception */
final case class VideoNonAdattoException(private val message: String = "",
                                         private val cause: Throwable = None.orNull) extends Exception(message, cause);