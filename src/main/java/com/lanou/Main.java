package com.lanou;

public class Main {
    public static void main(String[] args) {
        // 面向切面编程(AOP):是对面向对象编程的补充,能够减少代码冗余
        //面向切面编程是对面向对象编程的补充

        //面向切面编程的术语
        //1.切面(Aspect):一个关注点的模块化,这个关注点可能会横切多个对象
        //2.连接点(JoinPoint):程序执行到某个位置
        //3.通知(Advice):切面在连接点处执行的动作
        //4.切入点(Pointcut):切面选择的连接点
        //5.目标对象(TargetObject):被切面通知的对象
        //6.织入(Weaving):把切面跟对象关联,并创建该对象代理对象的过程
        //7.引入(introduction):在不修改代码的前提下,引入可以在运行期为类动态添加一些方法或字段
        //8.增强:为类织入的过程,简单理解为为类添加新的功能

        //通知的类型
        //1.before:前置通知,在连接点之前通知
        //2.after:后置通知,在连接点执行后(包括正常执行和抛出异常)通知
        //3.around:环绕通知,可以自定义在连接点前或者后执行
        //4.after throwing:抛出异常后通知,在连接点抛出异常后通知
        //5.after return:返回后通知,在连接点正常完成后执行

        //pointcut expression:切入点的表达式,用于匹配指定的连接点(Spring中连接点都是方法级的)
        //bean(bean的id):匹配bean中的所有方法
        //execution(访问修饰符 返回值数据类型 方法名(参数类型)):匹配指定方法
        //this:匹配指定的类
        //target:匹配指定接口的实现类
        //within:匹配指定包中的类




    }
}
