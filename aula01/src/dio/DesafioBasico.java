package dio;

//Abaixo segue um exemplo de código que você pode ou não utilizar:

public class DesafioBasico {
 public static void main(String[] args){

//TODO: Crie um Array de números inteiros:
  int[] numbers = {2, 3, 5, 7, 11, 13, 18, 34};

//TODO: Implemente um laço de repetição que verifique APENAS seus números Pares:
   for (int i = 0; i < numbers.length; i++){
       if (numbers[i] % 2 == 0){
           System.out.println(numbers[i]);
       } 
   }
        
 }

}
