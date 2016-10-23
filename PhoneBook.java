import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Alex-notebook on 22.10.2016.
 */
public class PhoneBook {

    private HashMap<String, ArrayList<String>> phoneBookDB = new HashMap<String, ArrayList<String>>();

    public static void main(String[] args)
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            PhoneBook phoneBook = new PhoneBook();
            System.out.println("Введите ФИО:");
            phoneBook.printPhoneNumbers(input.readLine());
        } catch (IOException e) {System.out.println("Некорректный ввод");}


    }

    {
        ArrayList<String> phones = new ArrayList<String>();
        phones.add("+8 800 2000 500");
        phones.add("+8 800 200 600");
        phoneBookDB.put("Иванов И.И.", phones);

        ArrayList<String> phones2 = new ArrayList<String>();
        phones2.add("+8 800 2000 700");
        phoneBookDB.put("Петров П.П.", phones2);

        ArrayList<String> phones3 = new ArrayList<String>();
        phones3.add("+8 800 2000 800");
        phones3.add("+8 800 2000 900");
        phones3.add("+8 800 2000 000");
        phoneBookDB.put("Сидоров С.С.", phones3);
    }

    public void printPhoneNumbers(String fio)
    {
        if (phoneBookDB.containsKey(fio))
        {
            ArrayList<String> list = phoneBookDB.get(fio);
            for (int i = 0; i < list.size(); i++)
            {
                System.out.println(i+1 + ". " + list.get(i));
            }
        }
        else System.out.println("Пользователь с таким ФИО не найден");

    }

}
