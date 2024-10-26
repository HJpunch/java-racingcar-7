package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public final class Utils {
    public static List<String> enterCarList() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String text = Console.readLine();
        List<String> nameList = Arrays.asList(text.split(","));
        nameList.replaceAll(String::strip);
        return nameList;
    }

    public static int enterRound() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String text = Console.readLine();

        try {
            int round = Integer.parseInt(text);
            if (round < 0) {
                throw new IllegalArgumentException("양의 정수를 입력해주세요.");
            }
            return round;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("숫자형 문자를 입력해주세요.");
        }
    }

    public static void printResult(List<RacingCar> racingCarList) {
        for (RacingCar racingCar : racingCarList) {
            String name = racingCar.getName();
            int count = racingCar.getCount();

            System.out.println(name + " : " + "-".repeat(count));
        }
    }

    public static void printWinner(List<String> winnerList) {
        System.out.println("최종 우승자 : " + String.join(", ", winnerList));
    }
}
