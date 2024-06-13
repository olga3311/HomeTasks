package HometaskTwentySix;

public class Main {
    public static void main(String[] args) {


            Human person1 = new Human( "John", 20, HumanType.USER);
            Human person2 = new Human("Tom", 30, HumanType.ADMIN);
            String webAddress1 = "http://web-for-user.cinema";
            String webAddress2 = "http://web-for-proff";



            boolean result;
            Access access = new Access();
            result =  access.accessAllowed(webAddress1, person1.getType());
            System.out.println(person1.getType().getName() + " " + result);
            result = access.accessAllowed(webAddress2, person1.getType());
            System.out.println(person1.getType().getName() + " " + result);

            result = access.accessAllowed(webAddress2, person2.getType());
            System.out.println(person2.getType().getName() + " " + result);

        }

    }

