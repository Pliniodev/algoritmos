import kotlin.random.Random

/**
 * Problema
 * Dado um array de inteiros, mostre o indice de dois numeros cuja soma
 * é o resultado de um target qualquer, não considere indices iguais
 */
fun main() {
    val array = IntArray(1000) { Random.nextInt(0, 1000) }
    val target = Random.nextInt(0, 100)
    println(twoSum(array, target).contentToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var result1 = 0
    var result2 = 0
    run loop@{
        nums.forEachIndexed { index, numero ->
            nums.forEachIndexed { index2, numero2 ->
                val soma = numero + numero2
                if (soma == target && index != index2) {
                    result1 = index
                    result2 = index2
                    return@loop
                }
            }
        }
    }
    return intArrayOf(result1, result2)
}