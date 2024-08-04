public class PrimeNumber{  
    public static boolean isPrime(int num){
        int count=0;
for(int i=1;i<=Math.sqrt(num);i++){
if(num%i==0){
count++;
if(num/i !=i){
count++;
}
}
}
if(count==2){
return true;
}

    return false;

    }
 public static void main(String args[]){  
int count=0;
int i=1;
while(count!=100){
    if (isPrime(i)) {
        System.out.print(i+" ");
        count++;
        i++;
    }
    i++;
}
}  
} 
