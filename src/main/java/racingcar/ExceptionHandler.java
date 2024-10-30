package racingcar;

public class ExceptionHandler {
    static final String CAR_NAME_CONSTRAINT_MESSAGE = "자동차의 이름은 1자에서 5자 사이여야 합니다.";
    static final String NEED_INTEGER_MESSAGE = "숫자형 문자를 입력해주세요.";
    static final String NEED_POSITIVE_MESSAGE = "입력값이 음수입니다.";

    public static String validateCarName(String name) {
        if (name == null || name.isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException(CAR_NAME_CONSTRAINT_MESSAGE);
        }
        return name;
    }

    public static int validateNaturalNum(String value) {
        int num;

        try {
            num = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NEED_INTEGER_MESSAGE);
        }
        checkNegative(num);
        return num;
    }

    private static void checkNegative(int value) {
        if (value < 0) {
            throw new IllegalArgumentException(NEED_POSITIVE_MESSAGE);
        }
    }
}
