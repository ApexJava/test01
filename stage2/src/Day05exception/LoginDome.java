package Day05exception;

public class LoginDome {
    private static String[] names = {"c1","c2","c3"};
    public static void main(String[] args) {
        try {
            checkName("c2");
            System.out.println("注册成功！");
        }catch (LoginException e){
            System.out.println(e);
        }finally {
            System.out.println("欢迎登陆");
        }

    }
    public static void checkName(String uname) throws LoginException {
        for (String name: names){
            if (uname.equals(name)){
                throw new LoginException("已存在该用户名");
            }
        }
    }
}
