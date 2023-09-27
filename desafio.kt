enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} foi matriculado na formação $nome.")
    }
}

fun main() {
    
    val usuario1 = Usuario("Alexandre Moura")
    val usuario2 = Usuario("Joyce Mayara")
    
    val conteudo1 = ConteudoEducacional("Introdução a Java")
    val conteudo2 = ConteudoEducacional("Introdução a Python")
    
    val formacaoKotlin = Formacao("Formação em linguagens Java e Python ", listOf(conteudo1, conteudo2))
    
    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)
    
    // Verificando os inscritos na formação
    println("Inscritos na formação ${formacaoKotlin.nome}: ${formacaoKotlin.inscritos.map { it.nome }}")
}
 