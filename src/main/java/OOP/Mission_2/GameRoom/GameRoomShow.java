package OOP.Mission_2.GameRoom;

import java.util.Scanner;

public class GameRoomShow {
    public void GameRoomInit() {
        consolIO();

    }

    public static void consolIO() {
        Toy carBig = new Car(500.00, "Большая", 7, 2000, "Высокое", "Пластик");
        Toy carMedium = new Car(350.00, "Средняя", 5, 300, "Высокое", "Пластик");
        Toy carSmall = new Car(365.00, "Маленькая", 2, 100, "Высокое", "Металл");
        Toy dollBig = new Doll(257.00, "Большая", 4, 1000, "Высокое", "Пластик");
        Toy dollMedium = new Doll(325.00, "Средняя", 3, 1500, "Среднее", "Пластик");
        Toy dollSmall = new Doll(25.00, "Маленькая", 6, 300, "Высокое", "Пластик");
        Toy bollBig = new Boll(35.00, "Большой", 7, 1500, "Высокое", "Резина");
        Toy bollMedium = new Boll(455.00, "Средний", 9, 700, "Среднее", "Резина");
        Toy bollSmall = new Boll(405.00, "Маленький", 6, 1100, "Низкое", "Пластик");
        Toy cubeBig = new Cube(100.00, "Большой", 8, 300, "Высокое", "Дерево");
        Toy cubeMedium = new Cube(56.00, "Средний", 10, 1500, "Среднее", "Дерево");
        Toy cubeSmall = new Cube(355.00, "Маленький", 5, 180, "Низкое", "Дерево");

        GameRoom gameRoom = new GameRoom();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму на определенное количество игрушек: ");
        double result = Double.parseDouble(sc.next());
        gameRoom.setCost(result);
        gameRoom.addToy(carBig);
        gameRoom.addToy(carMedium);
        gameRoom.addToy(carSmall);
        gameRoom.addToy(dollBig);
        gameRoom.addToy(dollMedium);
        gameRoom.addToy(dollSmall);
        gameRoom.addToy(bollBig);
        gameRoom.addToy(bollMedium);
        gameRoom.addToy(bollSmall);
        gameRoom.addToy(cubeBig);
        gameRoom.addToy(cubeMedium);
        gameRoom.addToy(cubeSmall);
        boolean end = false;
        while (!end) {
            System.out.println("Сортировка игрушек по возрастной группе нажмите  : 1 ");
            System.out.println("Найти игрушки в комнате , по диапазону цен нажмите  : 2 ");
            try {
                int result1 = Integer.parseInt(sc.next());
                switch (result1) {
                    case 1: {
                        gameRoom.sortAgeGroup();
                    }
                    break;
                    case 2: {
                        findToys(sc, gameRoom);
                    }
                    break;
                    default: {
                        end = true;
                    }
                }
            } catch (Exception e) {
                end = true;
            }
            System.out.println("Желаете продолжить: 1 -Да,0-Нет ");
            int contunue = Integer.parseInt(sc.next());
            if (contunue == 1) {
                end = false;
            } else {
                end = true;
            }
        }

    }

    private static void findToys(Scanner sc, GameRoom gameRoom) {
        System.out.println("Введите начальный возрастной диапазон  ");
        double r1 = Double.parseDouble(sc.next());
        System.out.println("Введите конечный возрастной диапазон ");
        double r2 = Double.parseDouble(sc.next());
        gameRoom.findToys(r1, r2);
    }
}


