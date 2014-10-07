package practiceTwo;

import java.util.Random;

public class fifthPoint {

    StringBuilder string = new StringBuilder();
    Random random = new Random();
    int randomNum = random.nextInt((3000 - 1) + 1) + 1;

    public StringBuilder romanNumber() {
        while(randomNum >= 1000){
            string.append("M ");
            randomNum = randomNum - 1000;
        }
        
         while(randomNum >= 500){
            string.append("D ");
            randomNum = randomNum - 500;
        }
         
          while(randomNum >= 100){
            string.append("C ");
            randomNum = randomNum - 100;
        }
          
           while(randomNum >= 50){
            string.append("L ");
            randomNum = randomNum - 50;
        }
           
            while(randomNum >= 10){
            string.append("X ");
            randomNum = randomNum - 10;
        }
            
             while(randomNum >= 5){
            string.append("V ");
            randomNum = randomNum - 5;
             }
             while(randomNum >= 4){
            string.append("IV ");
            randomNum = randomNum - 4;
        }
             
              while(randomNum > 0){
            string.append("I ");
            randomNum = randomNum - 1;
        }
        return string;

    }

    
}
