public class TestExecute {
    public static void main(String[] args){
        Execute executingApp = new Execute();

        String dateMessage = executingApp.getCurrentDate();
        System.out.println(dateMessage);

        String sayHola = executingApp.greetSpanish("Lazaro");
        System.out.println(sayHola);

        String sayHello = executingApp.greetEnglish("Karina");
        System.out.println(sayHello);
    } 
}