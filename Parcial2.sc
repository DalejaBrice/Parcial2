case class Publicacion(id: Int, autor: String, texto: String, reacciones: List[String])
val publicaciones: List[Publicacion] = List(
  Publicacion(
    1,
    "Ana",
    "¡Nuevo taller de programación funcional la próxima semana!",
    List("like", "love", "like", "wow", "like")
  ),
  Publicacion(
    2,
    "Juan",
    "Recordatorio: mañana es la fecha límite para el proyecto final.",
    List("like", "like", "haha")
  ),
  Publicacion(
    3,
    "María",
    "¿Alguien recomienda buenos recursos para aprender Scala desde cero?",
    List("like", "love", "love", "wow", "haha", "like")
  ),
  Publicacion(
    4,
    "Carlos",
    "Se suspenden las clases de hoy por mantenimiento del sistema.",
    List("angry", "angry", "wow", "like")
  ),
  Publicacion(
    5,
    "Lucía",
    "Compartiendo un repositorio con ejemplos de programación reactiva.",
    List("love", "love", "like", "like", "wow")
  ),
  Publicacion(
    6,
    "Pedro",
    "No entiendo bien la diferencia entre programación declarativa e imperativa.",
    List("like", "haha", "haha")
  ),
  Publicacion(
    7,
    "Sofía",
    "Felicitaciones al equipo que ganó el hackatón de este semestre.",
    List("love", "love", "love", "wow", "like", "like")
  ),
  Publicacion(
    8,
    "Diego",
    "Subí un video explicando cómo usar map, filter y reduce en Scala.",
    List("like", "like", "wow", "wow", "haha")
  ),
  Publicacion(
    9,
    "Elena",
    "Encuesta: ¿prefieren proyectos individuales o en grupo para el curso?",
    List("like", "like", "like", "haha")
  ),
  Publicacion(
    10,
    "Fernando",
    "Actualización: ya está disponible el material de la semana 5 en el aula virtual.",
    List("like", "wow")
  ),
  Publicacion(
    11,
    "Raúl",
    "Me parece injusto el sistema de evaluación del laboratorio.",
    List("angry", "angry", "like")
  ),
  Publicacion(
    12,
    "Patricia",
    "Gracias por todas las sugerencias de recursos, ¡me han servido mucho!",
    List("love", "love", "love", "wow", "like", "like", "haha")
  )
)

case class PublicacionConPuntaje(pub: Publicacion, puntaje: Int)

def publiImpacta(l: List[Publicacion], longitud: Int): PublicacionConPuntaje = {

}

val filtro:List[PublicacionConPuntaje] = ((longMin: Int) => publicaciones.filter(_.reacciones.size <= longMin))

def publiV (list: List[Publicacion])
//Se debe implementar un metodo que reciba la lista de publicaciones y la longitud mínima de texto,
//y devuelva un valor de tipo PublicacionConPuntaje que represente la publicación con el mayor puntaje total,
//considerando solo las publicaciones cuyo texto sea suficientemente largo.
//El metodo debe seguir un algoritmo manual, basado en pasos como los siguientes:
//
//Filtrar las publicaciones para quedarse únicamente con aquellas cuyo texto alcance la longitud mínima.

//Para cada publicación válida, transformar su lista de reacciones en una lista de puntajes numéricos,
//de acuerdo con la tabla de valores elegida para cada tipo de reacción.
//Sumar los puntajes de cada publicación para obtener el puntaje total asociado a esa publicación.
//Crear un objeto PublicacionConPuntaje con la publicación original y su puntaje calculado.
//Recorrer la lista de PublicacionConPuntaje y seleccionar la que tenga el mayor valor en el campo puntaje.












