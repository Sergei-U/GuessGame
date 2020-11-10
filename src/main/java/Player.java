/**
 * @author Sergei Usov
 * @version 1.0.0
 */
public class Player {
    int number = 0;
    public void guess(){
        number =(int) (Math.random()*10);
        System.out.println("Я думаю что это число" +number);
    }
}
