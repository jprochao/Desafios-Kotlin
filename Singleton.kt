class User(val id: Int, val name: String)

/* 
 * No Kotlin, a declaração de um objeto (por meio da palavra-chave object) 
 * é uma maneira concisa e eficaz de implementar o padrão Singleton.
 */
object UserManager {

  private val users = mutableListOf<User>()

  fun addUser(name: String) {
  
    val id = users.size + 1
 	  val user = User(id, name)
 	  users.add(user)
    //TODO: Inplementar a lógica de adicionar um novo Usuário na lista "users".
    //Dica: Utilize o tamanho da lista "users" para gerar seus IDs.
  }

  fun listUsers() {
    
    users.forEach{
      println("${it.id} - ${it.name}")
      
    }
    //TODO: Inplementar a impressão/listagem dos "users", seguindo o padrão definido no enunciado.
  }
}

fun main() {
  //println("Quantidade? ")
  val quantity = readLine()?.toIntOrNull() ?: 0

  for (i in 1..quantity) {
    //println("Nome usuario? ")
    val name = readLine() ?: ""
    UserManager.addUser(name)
  }

  UserManager.listUsers()
}
