package JAVA8;

/**
 * @auther: wilson
 * @version: v1.0 创建时间: 2019-12-26:2019
 * Des:
 */
public class NewFeaturesTester {
    public static void main(String[] args) {
        NewFeaturesTester newFeaturesTester = new NewFeaturesTester();
        //带有类型声名的表达式
        MathOperation addition = (int a , int b) -> a+b;

        //没有类型声明的表达式
        MathOperation subtraction = (a,b) -> a-b;

        //带有大括号，带有返回语句的表达式
        MathOperation multiplication = (int a , int b)->{ return a *b;};

        //没有大括号和reture语句的表达式
        MathOperation division = (int a,int b)->a/b;

        //输出结果
        System.out.println("10 +5 = " + newFeaturesTester.operate(10,5, addition));
        System.out.println("10 -5 = " + newFeaturesTester.operate(10,5, subtraction));
        System.out.println("10 *5 = " + newFeaturesTester.operate(10,5, multiplication));
        System.out.println("10 /5 = " + newFeaturesTester.operate(10,5, division));


        //没有括号的表达式
        GreetingService greetingService1 = message -> System.out.println("Hello" + message);

        //有括号的表达式
        GreetingService greetingService2 = (message) -> System.out.println("Hello" + message);
        //调用sayMessage方法输出的结果
        greetingService1.sayMessage("Wilson");
        greetingService2.sayMessage("Bob");
    }

    //定义的一些接口和方法
    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
