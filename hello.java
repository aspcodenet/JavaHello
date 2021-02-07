class Application
{
    public static void main(String[] args) {
        
        System.out.println("Vad heter du?");    
        String s = System.console().readLine();

        System.out.println("Hur gammal är du?");    
        int age = 
            Integer.parseInt(System.console().readLine());
        
        System.out.println("Tjenahejsan " + s);    
        if(age > 48)
            System.out.println("You are soo old");    
        else            
            System.out.println("Thats still young");    


        for(int i = 0; i < age; i++)
        {
            System.out.println("varv " + i);
        }

    }
}