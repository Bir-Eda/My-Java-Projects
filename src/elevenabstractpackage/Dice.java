package elevenabstractpackage;

abstract class Dice {
    final int faces=6;

    abstract int rollDice();
    public void rollTwice(){
       // Random myRand =new Random();  Second Obtion
        //myRand.nextInt();
        int result=(int)(Math.random()*faces)+1;
        System.out.println(result);
    }
}
