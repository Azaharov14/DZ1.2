public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println( dog );
        var cat = 3.6;
        System.out.println( cat );
        var paper = 763789;
        System.out.println( paper );

        dog = dog + 4;
        System.out.println( dog );
        cat = cat + 4;
        System.out.println( cat );
        paper = paper + 4;
        System.out.println( paper );

        dog = dog - 3.5;
        System.out.println( dog );
        cat = cat - 1.6;
        System.out.println( cat );
        paper = paper - 7639;
        System.out.println( paper );

        var friend = 19;
        System.out.println( friend );
        friend = friend + 2;
        System.out.println( friend );
        friend = friend / 7;
        System.out.println( friend );

        var frog = 3.5;
        System.out.println( frog );
        frog = frog * 10;
        System.out.println( frog );
        frog = frog / 3.5;
        System.out.println( frog );
        frog = frog + 4;
        System.out.println( frog );

        var xMen = 78.2;
        System.out.println( xMen);
        var yMen = 82.7;
        System.out.println( yMen );
        var result1 = xMen + yMen;
        System.out.println( result1 );
        var result2 = yMen - xMen;
        System.out.println( result2 );

        var result3 = yMen % xMen;
        System.out.println( result3 );

        var fullTime = 640;
        System.out.println( fullTime );
        var onePeopleTime = 8;
        System.out.println( onePeopleTime );
        var result4 = fullTime / onePeopleTime;
        System.out.println("Всего работников в компании " + result4 + " человек");

        var allPeople = result4 + 94;
        System.out.println("Если в компании работает " + allPeople + " человек, то всего 640 часов работы может быть поделено между сотрудниками");

    }
}