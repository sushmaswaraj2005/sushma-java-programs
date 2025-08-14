class Neonnum{
    public static void main(String[]args){
        int num=1;
        int sq=num*num;
        int sum=0;
        while(sq>0){
            sum+=sq%10;
            sq/=10;
        }
        if(sum==num){
            System.out.println(num  + "is a neon number" );
        }
        else{
            System.out.println(num + "is not a neon number");
        }
    }
}
