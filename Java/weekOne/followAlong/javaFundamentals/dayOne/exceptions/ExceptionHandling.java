import java.util.Random;
class OutOfGasException extends Exception{}
class UnreliableFriend {
    public boolean deliverMessage() throws OutOfGasException{
        Random r = new Random();
        boolean hasGas = r.nextBoolean();
        if (hasGas){
            return true;
        }
        throw new OutOfGasException();
    }
}


class ExceptionHandling{
    public static void main(String[] args){
       
        UnreliableFriend bestFriend = new UnreliableFriend();
        try{
            bestFriend.deliverMessage();
            System.out.println("The message was delievered");
        } catch (OutOfGasException e){
            System.out.println("Hey, so, I ran out of gas...");
            //back up plan here
        }
    }
}