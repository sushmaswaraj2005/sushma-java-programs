class butterfly{
    public static void main(String[]args){
        int n=4;
        for(int i=1;i<=n;i++){
            System.out.println("*".repeat(i) + " ".repeat(2*(n-i)) + "*".repeat(i));
        }
        for(int i=n;i>=1;i--){
            System.out.println("*".repeat(i) + " ".repeat(2*(n-i)) + "*".repeat(i));
        }
    }
}
