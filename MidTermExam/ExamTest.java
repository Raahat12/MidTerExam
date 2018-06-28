package midtermexam;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guest
 */
public class ExamTest {

   
    
    
    
    
public static void main(String[] args){

String name = "Raahat";

double height =  1.0;

double weight = 60.5;//1.5

 for(double BMI= 0.0; BMI<3; BMI++){ 
       
System.out.println(getBMI(weight, height));
        
 if(getBMI(weight, height) >=25.0){
    weight++; height++;
 System.out.println("Overweight");
}
if(getBMI(weight, height) >=18.0){
weight++; height++;
    System.out.println("Underweight");
}

if(getBMI(weight, height)>=18.5){
weight++; height++;
    System.out.println("healthy");
}

}
 
  

   
   }
public static double getBMI(double w, double h){

    double bmi = w/h;
    
return bmi;  

} 

}
