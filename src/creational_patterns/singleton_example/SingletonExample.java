package creational_patterns.singleton_example;


public class SingletonExample {

    public static void main(String[] args) {
        LoggerSingleton logger = LoggerSingleton.getInstance();
        logger.setErrorCode(404);
        System.out.println(logger.getErrorCode());

        LoggerSingleton logger2 = LoggerSingleton.getInstance();
        System.out.println(logger2.getErrorCode());

        logger.setErrorCode(418);
        System.out.println(logger.getErrorCode());
        System.out.println(logger2.getErrorCode());

    }
}