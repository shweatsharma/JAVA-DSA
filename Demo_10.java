public class Demo_10 {
    public static void main(String[] args) {
    //1.Number positive, negative ya zero hai.
   /*  int num = 8; 
    if(num > 0){
        System.out.println("positive");

    }
    else if(num < 0){
        System.out.println("negativre");
    }
    else{
        System.out.println("num is 0");
    }


    //2.Number even hai ya odd.
    if(num %2 ==0){
        System.out.println("num is even");
    }
    else{
        System.out.println("negative");
    }

    //3.Voter eligible hai ya nahi? (18+).
    int age = 18;
    if(age > 18){
        System.out.println("you are eligible for vote");
    }
    else{
        System.out.println("you are not eligible");
    }

    //4.Do numbers me bada kaun hai.
    int num1 = 45;
    int num2 = 65;

    if(num1 > num2){
    System.out.println("num 1 is greater");
    }
    else if(num2 > num1){
        System.out.println("num2 is greater");
    }
    else{
        System.out.println("both are equal");
    }

    //5.Teen numbers me sabse bada kaun hai.
    int big1 = 67;
    int big2 = 87;
    int big3 = 97;
    if(big1 > big2 && big1 > big3){
        System.out.println("big is greater than both");
    }
    else if (big2 > big1 && big2 > big3){
        System.out.println("big2 is greater than both");
    }
    else if(big3 > big1 && big3 > big2){
        System.out.println("big3 is greater than both");
    }
    else{
        System.out.println("all ar equal");
    }

    //6.Year leap year hai ya nahi.
    int year = 2024;
    if(year % 4 == 0 && year % 100 != 0){
        System.out.println("year is leap year");
    }
    else if(year % 400 == 0){
        System.out.println("year is leap year");
    }
    else{
        System.out.println("not leap yaer");
    }

    //8.Student pass hai ya fail? (33 marks pass).
    int marks = 45;
    if(marks > 33){
        System.out.println("you are pss");
    }
    else{
        System.out.println("you are fail");
    }

    //9.Character vowel hai ya consonant.
    char c = 's';
    if(c == 'a' && c == 'e'  && c == 'i' && c == 'o' && c == 'u'){
        System.out.println("vowel");
    }
    else{
        System.out.println("constant");
    }

    //10.Salary par bonus lagega ya nahi (condition khud banao).
    int salary = 30000;
    int bonous;
    if(salary >= 30000){
        bonous = salary * 10/100;
        System.out.println("total salary = " + (salary + bonous));
    }
    else if(salary >= 15000 && salary <=29000){
        bonous = salary * 5/100;
        System.out.println("total slary = " + (salary + bonous));
        
    }
    else{
        System.out.println();
    }

    //11.1 se 10 tak print karo.
    for(int i = 1 ; i <= 10;i++){
        System.out.println(i);
    }

   //12. 10 se 1 tak print karo.
   for(int i = 10; i >= 1;i--){
    System.out.println(i);
   }

   //13.n ka factorial nikalo.

   //14. Multiplication table print karo.
   for(int i = 5;i <=50;i+=5){
    System.out.println(i);
   }

   //15.Number ke digits count karo.
   //16.Number reverse karo.
   //17.Check karo number palindrome hai ya nahi.

   
   //19.Array ke saare elements print karo.
   int[] marks3 = new int[5];
   marks3[0]=45;
   marks3[1]=55;
   marks3[2]=65;
   marks3[3]=75;
   marks3[4]=85;
   for(int i = 0;i<marks3.length;i++){
    System.out.println(marks3[i]);
   }*/

   //20.Array ka sum nikalo.
  /*  int sum = 0;
   int [] mark = {45,63,85,78};
   for(int i = 0;i < mark.length;i++){
    sum = sum + mark[i];
    
   }
   System.out.println(sum);*/

   //21.Array ka average nikalo.
  /*  double avg;
   double sum = 0;
   int [] mark = {45,63,85,78};
   for(int i = 0;i < mark.length;i++){
    sum = sum + mark[i];
    
   }
   avg = sum / mark.length;
   System.out.println(avg);
   

  //22.Largest element find karo.
  int [] arr = {45,63,85,78};
  int max = arr[0];
  for(int i = 0;i < arr.length;i++){
    if(arr[i] > max){
        max = arr[i];
    }

  }
  System.out.println(max);

  

  //23.Smallest element find karo.
  int [] arr1 = {45,63,85,78};
  int min = arr1[0];
  for(int i = 0; i < arr.length; i++){
    if(arr1[i] < min){
        min = arr[i];
    }
}
System.out.println(min);*/

  //24.Even elements print karo.
 /*  int [] even = {12,18,43,46,53,54};
  for(int i = 0; i < even.length; i++){
    if(even[i] % 2 == 0){
        System.out.println(even[i]);
    }
  }

  //25.Odd elements print karo.
  int [] odd ={12,18,43,46,53,54};
  for(int i = 0; i < odd.length;i++){
    if(odd[i] % 2 != 0){
        System.out.println(odd[i]);
    }
  }*/
  //26.Array reverse print karo.
  int [] rev ={12,13,14,15,16,17,18,19,20};
  for(int i = rev.length - 1; i > 0; i--){
    System.out.println(rev[i]);
  }
  //27.Kisi element ko search karo.
  int [] search = {10,20,30,40,50,60,70,80,90};
  int target = 55;
  for(int i = 0; i < search.length;i++){
    if(search[i] == target){
        System.out.println("found "+ target);
        break;

    }

    if(i == search.length -1){
         System.out.println("not found");

      }
    }
       

  //28.Second largest element find karo.
  
  //29.Array me duplicate elements count karo.

  //30.Do arrays ko merge karo.

  //31.Array sort karo (without Arrays.sort()).

  //32.Frequency of each element nikalo.
  
  //33.Array left rotate by 1.

    }
    
}
