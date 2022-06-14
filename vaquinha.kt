import java.util.Scanner

fun vaquinha(conta:Float, pessoas:Int): Float {
    
    return conta/pessoas;
}

fun main() {

   val teclado = Scanner(System.`in`)
   print("Digite o valor da conta:\t");

   var conta:Float = teclado.nextFloat()
   print("Digite a quantidade de pessoas:\t");

   var pessoas:Int = teclado.nextInt()
   println ("para cada pessoa:" + vaquinha(conta,pessoas));

   }
  
  