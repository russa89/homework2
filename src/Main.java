public class Main {
    public static void main(String[] args) {
    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;
    System.out.println(dog);
    System.out.println(cat);
    System.out.println(paper);

    dog = dog + 4;
    cat = cat + 4;
    paper = paper + 4;

    System.out.println(dog);
    System.out.println(cat);
    System.out.println(paper);

    dog = dog - 3.5;
    cat = cat - 1.6;
    paper = paper - 7639;

    System.out.println(dog);
    System.out.println(cat);
    System.out.println(paper);

    var friend = 19;
    System.out.println(friend);

    friend = friend + 2;
    System.out.println(friend);

    friend = friend / 7;
    System.out.println(friend);

    var frog = 3.5;
    System.out.println(frog);

    frog = frog * 10;
    System.out.println(frog);

    frog = frog / 3.5;
    System.out.println(frog);

    frog = frog + 4;
    System.out.println(frog);

    var firstBoxerWeight = 78.2;
    var secondBoxerWeight = 82.7;
    var totalBoxerWeights = firstBoxerWeight + secondBoxerWeight;
    System.out.println("Общая масса двух боксеров " + totalBoxerWeights + " кг!");
    var differenceBoxerWeight = secondBoxerWeight - firstBoxerWeight;
    System.out.println ("Разница в весе между боксерами " + differenceBoxerWeight + " кг!");

    var firstNumber = 78.2;
    var secondNumber = 82.7;
    var differenceNumber = secondNumber % firstNumber;
    System.out.println(differenceNumber);

    var totalWorkTime = 640;
    var oneEmployeeWorkTime = 8;
    var quantityOfEmployees = totalWorkTime / oneEmployeeWorkTime;
    System.out.println("Всего работников в компании - " + quantityOfEmployees + " человек");

    quantityOfEmployees = quantityOfEmployees + 94;
    totalWorkTime = quantityOfEmployees * oneEmployeeWorkTime;
    System.out.println("Если в компании работает " + quantityOfEmployees + " человек, то всего " + totalWorkTime + " часов работы может быть поделено между сотрудниками");


            }
}