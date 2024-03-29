/**
 * @author Sergei Usov
 * @version 1.0.0
 */
public class GuessGame {

    public void startGame() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Я загадываю число от 0 до 9 ...");

        while (true) {
            System.out.println("Число которое нужно угадать, - " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();


            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это " + guessp1);

            guessp2 = p3.number;
            System.out.println("Второй игрок думает, что это " + guessp2);

            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {

                System.out.println("У нас есть победитель?");
                System.out.println("Первый игрок угадал?" + p1isRight);
                System.out.println("Второй игрок угадал?" + p2isRight);
                System.out.println("Третий игрок угадал?" + p3isRight);
                System.out.println("Конец игры");
                break;
            } else {
                System.out.println("Игроки должны попробовать еще раз");
            }
        }
    }

}
