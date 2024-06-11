package HometaskTwentySix;
//1) Создатйте enum "Тип пользователя" с вариантами констант: USER, ADMIN
//1) Необходимо создать класс "Человек", добавить в него поле "Тип пользователя" с енамом,
// остальные поля придумайте самостоятельно
//2) Создать интерфейс Фильтр. В него добавьте метод, который принимает строку
// (веб-адрес, к которому подключается человек)
//и тип пользователя (enum). Метод отдает boolean значение, пропускает ли он человека к ресурсу или нет.
//3) Реализуйте интерфейс таким образом
// 3.1) Если это админ, то досту разрещен к любому сайту
// 3.2) Если это пользователь, то ему разрешен доступ только к сайтам,
// которые начинаются на "http://web-for-user"
//4) Самостоятельно создайте пару пользователей и попробуйте проверить, к каким сайтам у них есть доступ
// 5*) Добавьте в enum поле, обозначающее название роли пользователя на русском языке
public class Access implements Filter {
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

    @Override
    public boolean accessAllowed(String webAddress, HumanType person) {
        String allowedWebAddress = "http://web-for-user";

        if (person == HumanType.ADMIN) {
            return true;
        } else if (person == HumanType.USER) {
            if (webAddress.contains(allowedWebAddress)) {
                return true;
            } else return false;
        }
        return false;
    }
}