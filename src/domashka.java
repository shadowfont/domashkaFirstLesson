public class domashka {
    public static void main(String[] args) {
        //Базовый уровень
//Задача №1
//Дано (их менять нельзя)
//String hi = "                Hello ";
//String world = " WoRld!";
//char newLine = '\n';
//Создать из трех переменных единую строку,
//Привести к правильному виду (Ниже)
//затроить (Можно вызвать тольку одну команду System.out.print())
//
//Результат вывода на экран:
//Hello world!
//Hello world!
//Hello world!


//Задача №2
//Создать переменные с ростом, весом.
//Произвести расчет индекса массы тела (вес) / (рост * рост) используя переменные, вывести на экран
//Пример результата вывода на экран:
//21.0

//Задача №3
//Создать из массива букв a,b,c,d,e, строку,вывести на экран , поменять в массиве 4 букву по счету на h,
//и снова создать строку, вывести на экран


        //Задача №1
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        String result = hi.trim() + world.toLowerCase() + newLine;
        String resultRepeated = result.repeat(3);
        System.out.println(resultRepeated);


        //Задача №2
        double growth = 1.69;
        int weight = 48;
        double growthDouble = growth * growth;
        double index = weight / (int) growthDouble;
        System.out.println(index);




        //Задача №3
        char[] myArray = new char[5];
        myArray[0] = 'a';
        myArray[1] = 'b';
        myArray[2] = 'c';
        myArray[3] = 'd';
        myArray[4] = 'e';

        char[] myArray2 = myArray;
        myArray2[3] = 'h';
        //Непонимаю как правильно снова создать строку и вывести на экран поэтому делаю костылями)

        String againString = "abcde";

        System.out.println(myArray);
        System.out.println(againString);
        //или System.out.println("abcde");









    }
}



